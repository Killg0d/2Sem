//230970005
//Tarun
//12-2-24

import java.util.Scanner;

class Box
{
	private double length,width,height;
	Box()
	{}
	Box(double l,double w,double h)
	{
		length=l;
		width = w;
		height = h;
	}
	void Volume()
	{
		System.out.println("Volume :"+length*width*height);
	}
	void getData(double length, double width, double height)
	{
		this.length = length; this.width = width; this.height = height;
	}
	void display()
	{
		System.out.println("Length = " + length);
		System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		Volume();
	}
}
class BoxDerived extends Box
{
	private double weight;
	private String color;
	BoxDerived()
	{

	}
	BoxDerived(double l,double w,double h,double wt,String c)
	{
		super(l,w,h);
		weight=wt;
		color=c;
	}
	void getData()
	{
		System.out.println("Length, Width, Height, Weigth and Color?");
		Scanner sc =new Scanner(System.in);
		super.getData(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		weight=sc.nextDouble();
		color=sc.next();
	}
	void display()
	{
		super.display();
		System.out.println("Weigth = " + weight);
		System.out.println("Color = " + color);
	}
}
class Box1
{
	public static void main(String args[])
	{
		BoxDerived b= new BoxDerived();
		b.getData();
		b.display();
	}
}


