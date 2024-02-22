//tarun
//230970005
//12-02-2024
import java.util.Scanner;

class Palindrome {
    static String ordinary_reverse(String s)
    {
		String rev= new String();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
    static String reverse(String s)
    {

        System.out.println(new StringBuffer(s).reverse());
        return new String(new StringBuffer(s).reverse());
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String s=sc.next();
        if(s.equals(reverse(s)))
            System.out.println("String is palindrome");
        else
        System.out.println("String is not palindrome");

    }
}
