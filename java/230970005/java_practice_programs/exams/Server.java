import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Server {
    File f;
    Server(String path)
    {
        f=new File(path);
    }
    void encrypt() throws Exception
    {
        if(f.exists())
        {
        
            FileInputStream fi=new FileInputStream(f);
            byte[] buf=fi.readAllBytes();
            FileOutputStream o=new FileOutputStream("encrypt.txt");
            for(int i=0;i<buf.length;i++)
            {
                
                o.write(buf[i]+1);
            }
            
            
        }
    }
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name");
        String client=sc.next();
        Server s=new Server(client);
        s.encrypt();

    }
}
