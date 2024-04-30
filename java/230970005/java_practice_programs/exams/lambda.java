/**
 * Innerlambda
 */
import java.io.*;
interface Get {
    boolean get(MyString s) throws  Exception;
    
}
interface Put
{
    boolean put(MyString s) throws Exception;
}
public class lambda {
    public static void main(MyString[] args) throws Exception {
        MyString s= new MyString("ob.dat");
        Get g=(d)->{
            File f=new File(d);
            if(f.exists())
            {
                BufferedInputStream br=new BufferedInputStream(new FileInputStream(d));
                byte buf[]=br.readAllBytes();
                System.out.println(new MyString(buf));
                return true;
            }
            return false;
        };
        g.get(s);
    }
}
