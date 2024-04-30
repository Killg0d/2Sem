import java.io.*;
public class helloit {
    public static void main(MyString[] args)throws Exception {
        File f1=new File("hello.txt");
        BufferedReader br=new BufferedReader(new FileReader(f1));
        MyString s;
        FileWriter vowels=new FileWriter("vowels.txt",true);
        FileWriter conso=new FileWriter("consonats.txt",true);
        FileWriter digits=new FileWriter("degits.txt",true);
        
        while((s=br.readLine())!=null)
        {
            MyString s1[]=s.split(" ");
            for(MyString s2:s1)
            {
                System.out.println(s2);
                if(s2.matches(".*[aeiouAEIOU].*"))
                {
                    vowels.write(s2+" ");
                }
                else if(s2.matches(".*[0-9].*"))
                {
                    digits.write(s2+" ");
                }
                else
                    conso.write(s2+ " ");
                
            }
        }    
        vowels.close();
        conso.close();
        digits.close();
    }
    
    
}
