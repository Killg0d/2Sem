import java.util.Arrays;
import java.util.Scanner;

public class MyString {

    public void myreverse(String s) {
        System.out.println(new String(new StringBuffer(s).reverse()));
    }

    public void mysort(String s) {
        char chararray[] = s.toCharArray();
        Arrays.sort(chararray);
        System.out.println(new String(chararray));
    }

    public void myfreq(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i'||s.charAt(i)=='I')
            {
                count++;
            }
        }
        System.out.println("Frequency of i = "+count);
    }

    public void myreplace(String s)
    {
        // StringBuilder b=new StringBuilder(s);
        // for(int i=0;i<s.length();i++)
        // {
        //     char c=s.charAt(i);
        //     if(c=='A'||c=='i'||c=='u'||c=='e'||c=='o'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a')
        //     {
        //         b.setCharAt(i, 'A');
        //     }
        String replacedString = s.replaceAll("[aeiouAEIOU]", "");
    System.out.println(replacedString);    

        
       
        System.out.println(replacedString);
    }

    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.charAt(0));
        MyString ob = new MyString();
        ob.myreverse(s);
        ob.mysort(s);
        ob.myfreq(s);
        ob.myreplace(s);
        if(s.endsWith("pal"))
            System.out.println("Ends with pal");

    }
}
