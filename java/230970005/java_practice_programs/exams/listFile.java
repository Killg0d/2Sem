import java.io.File;

public class listFile {
    public static void main(String[] args) {
        if(args.length==1)
        {
            File f =new File(args[0]);
            File l[]=f.listFiles();
            for(File fi : l)
            {
                System.out.println(fi.getName());
            }
        }
    }
}
