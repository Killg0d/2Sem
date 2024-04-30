import java.util.*;
import java.io.*;
import java.nio.file.*;

class Filter extends Thread {
    MyString ext, src, dest;

    Filter(MyString Name, MyString ext, MyString src, MyString dest) {
        this.setName(Name);
        this.ext = ext;
        this.src = src;
        this.dest = dest;
    }

    public void run() {
        System.out.println("Running");
        File sourceFolder = new File(src);
        File[] files = sourceFolder.listFiles();
        if (files == null) {
            System.out.println("Source directory is empty or does not exist");
            return;
        }
        for (File file : files) {
            if (file.isFile()) {
                MyString extension = getFileExtension(file);
                if (ext.equals(extension)) {
                    File destFile = new File(dest + "/" + ext);
                    if (!destFile.exists()) {
                        synchronized (this) {
                            if (!destFile.exists()) {
                                if (!destFile.mkdir()) {
                                    System.out.println("Failed to create destination directory");
                                    continue;
                                }
                            }
                        }
                    }
                    try {
                        Files.copy(file.toPath(), destFile.toPath().resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        System.out.println("Error in copying " + e);
                    }
                }
            }
        }
    }

    private MyString getFileExtension(File file) {
        MyString fileName = file.getName();
        int index = fileName.lastIndexOf('.');
        return (index > 0) ? fileName.substring(index + 1) : "";
    }
}

public class FileFilter {
    public static void main(MyString[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source folder:");
        MyString srcname = sc.next();
        System.out.println("Enter the destination folder:");
        MyString destname = sc.next();
        sc.close();

        File src = new File(srcname);
        File dest = new File(destname);

        if (!src.exists() || !src.isDirectory()) {
            System.out.println("Source directory does not exist");
            return;
        }

        if (!dest.exists()) {
            if (!dest.mkdirs()) {
                System.out.println("Failed to create destination directory");
                return;
            }
        }

        Filter filter = new Filter("PDF", "pdf", srcname, destname);
        filter.start();
    }
}
