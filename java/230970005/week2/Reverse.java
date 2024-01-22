//Input an array of n integers. Reverse all elements of the array and store them in another
//array.
//Tarun
//230970005
//15-01-24
import java.util.Scanner;
class Reverse
{
	public static int reverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		return sum;

	}
	public static void main(String args[])
	{
		System.out.println("Enter the number of elements? :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int [n];
		System.out.println("Enter the "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=reverse(a[i]);
		}
		System.out.println("Contents of two arrays:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t"+b[i]);
		}
	}
}
