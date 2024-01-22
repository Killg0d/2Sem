// Write a java program to accept distance travelled (in kilometre) and the quantity of fuel
//used (in litre) for a journey and determine the average fuel economy for that journey. Based
//on this, perform the following two operations for the user:
// Fuel estimation: Estimate the fuel needed for the distance entered by the user.
// Distance estimation: Estimate the distance that can be travelled for the quantity of
//fuel entered by the user.
//230970005
//Tarun
//08-01-2024
import java.util.Scanner;
class Journey
{
	float dist,fuel,economy;
	public void geteconomy()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance(Km):");

		dist = sc.nextFloat();
		System.out.println("Enter the fuel(Ltr):");
		fuel = sc.nextFloat();
		economy = dist/fuel;
		System.out.println("Average fuel consumption:"+economy);
	}
	public void getdist()
	{
		System.out.println("Enter the fuel:");
		Scanner sc = new Scanner(System.in);
		fuel = sc.nextFloat();
		dist = economy*fuel;
		System.out.println("Estimated dist: " + dist);
	}
	public void getfuel()
	{
		System.out.println("Enter the dist:");
		Scanner sc = new Scanner(System.in);
		dist = sc.nextFloat();
		fuel = dist / economy;
		System.out.println("Estimated fuel: " + fuel);
	}

	public static void main(String args[])
	{
			Journey j =new Journey();
			j.geteconomy();
			int ch ;
			do
			{
				System.out.println("\n1.Dist Estimation\n2.Fuel Estimation\nEnter the choice:");
				Scanner sc = new Scanner(System.in);

				ch = sc.nextInt();
				switch(ch)
				{
					case 1:
						j.getdist();
						break;
					case 2:
						j.getfuel();
						break;
					case 3:break;
					default: System.out.println("Invalid choice " );
				}
			}
			while(ch!=3);

	}

}