package world;

import java.util.*;
import java.io.*;
class SourceException extends Exception
{
    public String toString()
    {
        return  "Source not found";
    }
}
class Mythread extends Thread
{
    String src,dest;
    Mythread(String name,String src,String dest)
    {
        this.setName(name);
        this.src=src;
        this.dest=dest;
    }
    public void run(){


        File srcFile=new File(src);
        File desFile=new File(dest);
        if(!desFile.exists())
        {
            desFile.mkdirs();
        }
        File filelist[]=srcFile.listFiles((f)->f.isFile()&&f.getName().endsWith(".java"));
        System.out.println("Working");
        for(File f1:filelist)
        {
            System.out.println("Working");
            try{
                FileInputStream fin=new FileInputStream(f1);
                int c;
                System.out.println("working");
                while((c=fin.read())==-1)
                {
                    System.out.println(c);
                }
            }
            catch(Exception e)
            {
                e.getStackTrace();
            }
        }
    }
}
public class FileFilter {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String srcname=null;
        boolean flag=true;
        while (flag) {
            try {
                System.out.println("Enter the source:");
                srcname = sc.next();
                if (!new File(srcname).exists())
                    throw new SourceException();
                flag = false;
            } catch (SourceException e) {
                System.out.println("Source does not exist!"+e);
                flag = true;
            }
        }
        System.out.println("Enter the destination:");
        String destname = sc.next();
        Mythread t1=new Mythread("Hello",srcname,destname);
        t1.start();


    }
}
