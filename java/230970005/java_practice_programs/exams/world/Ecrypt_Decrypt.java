package world;
import java.io.*;
import java.util.*;
class Encrypt extends Thread
{
    Encrypt()
    {}
    public void run()
    {
        try{
            FileInputStream fin=new FileInputStream("jack.txt");
            byte[] b=new byte[fin.available()];
            fin.read(b);
            FileOutputStream fo=new FileOutputStream("encrypt.txt");
            for(int i=0;i<b.length;i++)
            {
                b[i]+=7;
            }
            fo.write(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        

    }
}
class Decrypt extends Thread
{
    Decrypt()
    {}
    public void run()
    {
        try{
            FileInputStream fin=new FileInputStream("encrypt.txt");
            byte[] b=fin.readAllBytes();
            fin.read(b);
            FileOutputStream fo=new FileOutputStream("decrypt.txt");
            for(int i=0;i<b.length;i++)
            {
                b[i]-=7;
            }
            fo.write(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        

    }
}
 
public class Ecrypt_Decrypt {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line:");
        String line=sc.nextLine();
        FileOutputStream fo=new FileOutputStream("jack.txt");
        byte[] buf=line.getBytes();
        fo.write(buf);
        Encrypt e =new Encrypt();
        Decrypt d = new Decrypt();
        e.start();
       
        d.start();
        
    }
}
