//Write a program to read an array of n distinct numbers, and display all the pairs (x,y) such
//that x>y.
//Tarun
//230970005
//15-01-24
import java.util.Scanner;
class Greater
{

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
		System.out.println("Contents of Great pairs in arrays:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
	}
}
