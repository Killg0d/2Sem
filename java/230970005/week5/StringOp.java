/*Input two strings (s1 and s2) and two integers (n1 and n2). Perform the following string
operations.
Display the upper-case equivalent of s1.
Display the lower-case equivalent of s2.
Extract a substring of length n2 from s1 starting at position n1.
Insert s2 into s1 at position n1.
Append s2 to s1.*/
//230970005
//Tarun
//12-2-24

import java.util.Scanner;

class StringOp
{
	public static String insert(String s1,String s2,int position)
	{
		return s1.substring(0,position)+s2+s1.substring(position);
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Input two strings:");
		String s1,s2;
		s1=sc.next();
		s2=sc.next();

		System.out.print("Input position:");int p=sc.nextInt();
		System.out.print("\nInput length:");int l=sc.nextInt();
		System.out.println("\nUppercase of "+s1+" is "+ s1.toUpperCase());
		System.out.println("\nLowercase of "+s2+" is "+ s2.toLowerCase());
		System.out.println("\nSubstring of "+s1+" from position "+p+" with length "+l+" = "+ s1.substring(2,(2+3)));
		String s3=insert(s1,s2,p);
		System.out.println("\nAfter inserting "+s2+" into "+s1+" at position "+p+" = "+ s3);
		System.out.println("\nAfter appending "+s2+" into "+s1+" = "+ (s1+s2));
	}
}