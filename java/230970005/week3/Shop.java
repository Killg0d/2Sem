//Create a class called Shop with data members for storing item id, item name, quantity, unit
//price and total bill amount. Implement the above using a menu-driven program.
// Tarun
// 230970005
// 15/01/2024
import java.util.Scanner;
class Item
{

	private static int itemno=0;
	private String itemname;
	private int qty;
	private double price;
	private static double total=0;
	public Item()
	{
		itemno++;
	}
	public void getdata()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item name:");
		itemname=sc.next();
		System.out.println("Enter item qty:");
		qty=sc.nextInt();
		System.out.println("Enter item price:");
		price=sc.nextDouble();
		total+=price*qty;
	}
	public void display()
	{
		System.out.println("item name:"+itemname);
		System.out.println("Enter item qty: "+ qty);
		System.out.println("Enter item price: "+price);
	}
	static void calculate()
	{
		if(total < 500)
		{

			System.out.println("No Discount!");
			System.out.println("Total : "+total);
		}
		else if(total >= 500 && total < 1000)
		{

			System.out.println("10% discount applied!");
			total -= (0.10) * total;
			System.out.println("Total : "+total);
		}
		else if(total >= 1000 && total < 2000)
		{

			System.out.println("12% discount applied!");
			total -= (0.12) * total;
			System.out.println("Total : "+total);
		}
		else
		{

			System.out.println("15% discount applied!");
			total -= (0.15) * total;
			System.out.println("Total : "+total);
			}
	}
}
class Shop
{
	public static void main(String args[])
	{
		int MAX=2;
		Item s[]=new Item[MAX];
		int ch;
		int i=0;
		Scanner sc=new Scanner(System.in);
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
						s[i]=new Item();
						s[i++].getdata();
						break;
				case 2: for(int k=0;k<i;k++)
						{
							s[k].display();
						}
						Item.calculate();
						System.exit(1);

			}
		}while(ch!=3);
	}
}
