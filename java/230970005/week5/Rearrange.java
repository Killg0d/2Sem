//tarun
//230970005
//12-02-2024
import java.util.Scanner;
class Rearrange {
    static String rearrangeCase(String s) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer rb=new StringBuffer();

        for (; sb.length()!=0;)
        {
            char low = sb.charAt(0);//H
            int lx=0;
            for (int j = 0; j < sb.length(); j++)
            {//0-4
                if ((low >= (int) sb.charAt(j))) {//H>Etrue then swap E
                    low=sb.charAt(j);
                    lx=j;
                }
            }
                rb.append(low);
                sb.deleteCharAt(lx);
        }
        return new String(rb);
    }
	static String rearrangeWithoutCase(String s)
	{
        StringBuffer sb = new StringBuffer(s);
        StringBuffer rb=new StringBuffer();

        for (; sb.length()!=0;)
        {
            char low = sb.charAt(0);//H
            int lx=0;
            for (int j = 0; j < sb.length(); j++)
            {//0-4
                if (Character.toLowerCase(low) >= Character.toLowerCase(sb.charAt(j))) {//H>Efalse then no swap E
                    low=sb.charAt(j);
                    lx=j;
                }
            }
                rb.append(low);
                sb.deleteCharAt(lx);
        }
        return new String(rb);
    }
    public static void main(String[] args) {
       System.out.print("Input a String:");
       Scanner sc =new Scanner(System.in);
       String s=sc.next();
       System.out.println("\nOutput String (with case) = " + rearrangeCase(s));
       System.out.println("\nOutput String (without case) = " + rearrangeWithoutCase(s));

    }
}
