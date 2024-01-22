//Create a class called Shop with data members for storing item id, item name, quantity, unit
//price and total bill amount. Implement the above using a menu-driven program.
// Tarun
// 230970005
// 15/01/2024
import java.util.Scanner;
class Telephone
{

	private static int custid=0;
	private String name;
	private int phoneno;
	private int billno=100;
	private int no_of_calls;
	private double bill;
	public Telephone()
	{
		custid++;
		billno++;
	}
	public void getdata()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cust name:");
		name=sc.next();
		System.out.println("Enter cust phoneno:");
		phoneno=sc.nextInt();
		System.out.println("Enter cust calls:");
		no_of_calls=sc.nextInt();
	}
	public void display()
	{
		System.out.println("item name:"+name);
		System.out.println("Enter item phoneno: "+ phoneno);
		System.out.println("Enter item price: "+price);
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
		else if(no_of_calls<=)
		{
			bill=100+50*0.6+(no_of_calls-150)*0.5;
		}
		else
		{
			bill=100+50*0.6+50*0.5+(no_of_calls-200)*0.4;
		}
	}
}
class Shop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int MAX=sc.nextInt();
		Telephone s[]=new Telephone[MAX];
		int ch;
		int i=0;
		do
		{
			System.out.println("\n1.Read\n2.Display\n3.Exit\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: if(i>=MAX)
						{
							System.out.println("\nCannot read anymore values");
							break;
						}
						System.out.println("Enter item to read:");
						s[i]=new Telephone();
						s[i++].getdata();
						break;
				case 2: for(int k=0;k<i;k++)
						{
							s[k].display();
						}
						Telephone.calculate();
						System.exit(1);

			}
		}while(ch!=3);
	}
}
