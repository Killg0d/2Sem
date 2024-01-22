//Program to calculate Hourly pay of workers
//230970005
//Tarun
//08-01-2024
import java.util.Scanner;
class Work
{
	double hours,rate,pay;

	public void getdata()
	{
		System.out.println("Enter the number of hours worked:");
		Scanner sc = new Scanner(System.in);
		hours = sc.nextDouble();
		System.out.println("Enter the hourly rate:");
		rate=sc.nextDouble();
		if(hours<40)
		{
			pay=hours*rate;
		}
		else
		{
			pay=(40*rate)+(hours-40)*(rate*1.5);
		}
		System.out.println("The total pay: " + pay);

	}

	public static void main(String args[])
	{
			Work w = new Work();
			w.getdata();

	}

}