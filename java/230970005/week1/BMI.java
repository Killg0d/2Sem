//Program to calculate BMI
//230970005
//Tarun
//08-01-2024
import java.util.Scanner;
class BMI
{
	float height,weight,bmi;
	public void getdata()
	{
		System.out.println("Enter the weight(KG):");
		Scanner sc = new Scanner(System.in);
		weight = sc.nextFloat();
		System.out.println("Enter the height(cm):");
		height=sc.nextFloat();
		height=height/100f;
	}
	public void calculateBMI()
	{
		bmi=weight/(height*height);
	}
	public void display()
	{
		System.out.println("BMI = "+bmi);
		if (bmi<18.5)
			System.out.println("Underweight !!");
		else if(bmi<24.59)
			System.out.println("Normal");
		else if ( bmi < 29.9)
			System.out.println("Overweight !!");
		else
			System.out.println("Obese !!!");
	}
	public static void main(String args[])
	{
		BMI bmi=new BMI();
		bmi.getdata();
		bmi.calculateBMI();
		bmi.display();
	}
}