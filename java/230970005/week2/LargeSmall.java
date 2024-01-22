//Write a java program to find the largest and smallest element in a two-dimensional array.
//Display the row & column indices of the largest and the smallest element in the given two
//dimensional array.
//Tarun
//230970005
//15-01-24
import java.util.Scanner;
class LargeSmall
{

	public static void main(String args[])
	{
		System.out.println("Enter the order of matrix? :");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		float a[][]=new float[m][n];

		System.out.println("Enter the "+m*n+" elements :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextFloat();
			}
		}

		System.out.println("Contents of twoD arrays:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		float largest=a[0][0],smallest=a[0][0];
		int lx=0,ly=0,sx=0,sy=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(largest<a[i][j])
				{
					largest=a[i][j];
					lx=i;
					ly=j;
				}
				if(smallest>a[i][j])
				{
					smallest=a[i][j];
					sx=i;
					sy=j;
				}
			}
		}
		System.out.println("The largest element = "+largest+", location = ("+lx+", "+ly+")");
		System.out.println("The smallest element = "+smallest+", location = ("+sx+", "+sy+")");
	}
}
