
//Program to calculate loan form 5 - 8%
//230970005
//Tarun
//08-01-2024
import java.util.Scanner;
class Loan
{

	public static void main(String args[])
	{
		double principal,years;
		double monthlyPayment,monthlyInterestRate;
		System.out.println("Enter the principal:");
		Scanner sc = new Scanner(System.in);
		principal = sc.nextFloat();
		System.out.println("Enter the years:");
		years=sc.nextFloat();
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		for(float i = 5f ; i<= 8.0f ; i=i+(1f/8f))
		{
			monthlyInterestRate = (i/100)/12;
			double a=(principal*monthlyInterestRate);
			double b=Math.pow((1+monthlyInterestRate),years*12);
			monthlyPayment=a/(1-(1/b));
			System.out.println(i +"%\t"+ monthlyPayment + "\t" + monthlyPayment*12*years);
		}

	}

}