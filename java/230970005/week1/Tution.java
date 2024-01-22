//Program to calculate Tution for 10 years
//230970005
//Tarun
//08-01-2024
import java.util.Scanner;
class Tution
{
	float principal,interest,years;

	public void getdata()
	{
		System.out.println("Enter the principal:");
		Scanner sc = new Scanner(System.in);
		principal = sc.nextFloat();
		System.out.println("Enter the interest:");
		interest=sc.nextFloat();
		System.out.println("Enter the years:");
		years=sc.nextFloat();
	}
	public void calculateInterest()
	{
		for(int i=1;i<years+1;i++)
			System.out.println("The fee after " + (i) + " years = " +(principal+principal*(interest/100)*i) );
	}

	public static void main(String args[])
	{
			Tution t = new Tution();
			t.getdata();
			t.calculateInterest();

	}

}