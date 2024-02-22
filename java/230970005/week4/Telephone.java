//Create a class called Shop with data members for storing item id, item name, quantity, unit
//price and total bill amount. Implement the above using a menu-driven program.
// Tarun
// 230970005
// 15/01/2024
import java.util.Scanner;
class Tele
{

	private static int count=0;
	private int custno;
	private String name;
	private long phoneno;
	private int billno;
	private int no_of_calls;
	private double bill;
	public Tele()
	{
		count++;
		custno=count;
		billno=count+100;
	}
	public void getdata()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cust name:");
		name=sc.next();
		System.out.println("Enter cust phoneno:");
		phoneno=sc.nextLong();
		System.out.println("Enter cust calls:");
		no_of_calls=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Cust name:"+name);
		System.out.println("Cust phoneno: "+ phoneno);
		System.out.println("Cust calls: "+no_of_calls);
		calculate_bill_amount();
		System.out.println("Cust billno:"+billno);
		System.out.println("Cust bills: "+bill);
	}
	public void calculate_bill_amount()
	{
		if(no_of_calls<=100)
		{
			bill=100;
		}
		else if (no_of_calls<=150)
		{

			bill=100+(no_of_calls-100)*0.6;
		}
		else if(no_of_calls<=200)
		{
			bill=100+50*0.6+(no_of_calls-150)*0.5;
		}
		else
		{
			bill=100+50*0.6+50*0.5+(no_of_calls-200)*0.4;
		}
	}
}
class Telephone
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int MAX=sc.nextInt();
		Tele s[]=new Tele[MAX];
		for(int k=0;k<MAX;k++)
		{
			s[k]=new Tele();
			s[k].getdata();
		}
	System.out.println("Customer details");
		for(int k=0;k<MAX;k++)
		{
			s[k].display();
		}


	}
}
