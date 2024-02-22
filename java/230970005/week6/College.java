// Create three classes as per the following specifications:
// Student: Data members are Register Number, Name, Course and Semester.
// Exam (derived from class Student): Data members are the marks scored in three subjects.
// Result (derived from class Exam): Data members are Total Marks and Grade.
//Implement get_data() and display() methods using the concept of method overriding.

//230970005
//Tarun
//19-2-24
import java.util.Scanner;
class Student
{
	private int regno,sem;
	private String name,course;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Reg no:");
		regno=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Course:");
		course=sc.next();
		System.out.println("Enter Semester:");
		sem=sc.nextInt();
	}
	void display()
	{
		System.out.println("Reg no:"+regno);
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
		System.out.println("Semester:" + sem);
	}

}
class Exam extends Student
{
	private int m1,m2,m3;
	void getdata()
	{
		super.getdata();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks1:");
		m1=sc.nextInt();
		System.out.println("Enter marks2");
		m2=sc.nextInt();
		System.out.println("Enter marks3:");
		m3=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Marks1 :"+ m1);
		System.out.println("Marks2 :"+ m2);
		System.out.println("Marks3 :"+ m3);
	}
	int getTotal()
	{
		return m1+m2+m3;
	}
	boolean Fail()
	{
		return(m1<35||m2<35||m3<35);
	}
}
class Result extends Exam
{
	private int total;
	private char grade;
	void getdata()
	{
		super.getdata();
		total=super.getTotal();
		if(Fail()){
			grade='F';
		}else{
			switch((int)total/30)
			{
				case 10:
				case 9:
				case 8: grade= 'A';
					break;
				case 7:grade ='B';
					break;
				case 6:grade = 'C';
					break;
				case 5:grade = 'D';
				break;
				case 4:grade='E';
				break;
				default: grade ='F';
			}
		}
	}
	void display()
	{
		super.display();
		System.out.println("Total :"+total);
		System.out.println("Result :"+ grade);
	}

}
class College
{
	public static void main(String args[]){
	Result r= new Result();
	r.getdata();
	r.display();
	}

}
