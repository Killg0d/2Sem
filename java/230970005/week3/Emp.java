// Program to create an employee class and compute salary
// Tarun
// 230970005
// 15/01/2024

import java.util.Scanner;
class Employee
{
	int empCode;
	String empName;
	float basic, HRA, IT, PF, netSal, grossSal;
	Scanner scan = new Scanner(System.in);
	public void getDetails()
	{
		System.out.print("Enter employee code: ");
		empCode = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter employee name: ");
		empName = scan.nextLine();
		System.out.print("Enter basic pay: ");
		basic = scan.nextFloat();
	}
	public void calcSal()
	{
		HRA = (75f/1000f)*basic;
		PF = (0.12f)*basic;
		IT = 200f;
		grossSal = basic + HRA;
		netSal = grossSal - (IT + PF);
	}
	public void showDetails()
	{
		System.out.println("Employee code: "+empCode);
		System.out.println("Employee name: "+empName);
		System.out.println("Net salary : "+netSal);
	}
}
public class Emp
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.getDetails();
		e.calcSal();
		e.showDetails();
	}
}

