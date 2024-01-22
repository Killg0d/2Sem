import java.util.Scanner;

class Array
{
	int a[] =new int[2];
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void display()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		Array a=new Array();
		a.getdata();
		a.display();
	}
}
