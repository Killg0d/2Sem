//Program to calculate roots of quadratic eq
//230970005
//Tarun
//08-01-2024
import java.util.Scanner;
class QuadRoots
{

	public static void main(String args[])
	{
		double a,b,c;
		double r1,r2;
		System.out.println("Enter the 3 co-efficient:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		r1=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
		r2=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
		System.out.println("Root1:"+r1 +"Root2:"+r2);


	}

}