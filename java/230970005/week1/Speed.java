//Write a java program to convert the input speed from kilometre per hour to meters per
//second and vice versa. Hint: 1 Kmph = 1000/3600 mps
//230970005
//Tarun
//08-01-2024

import java.util.Scanner;

public class Speed {
    public static double kmphToMps(double kmph)
    {
        double mps;
        mps= (kmph * 1000)/3600 ;
        return mps;
    }
    public static double mpsTokmph(double mps)
    {
        double kmph;
        kmph=(mps*3600)/1000;
        return kmph;
    }
    public static void main(String args[])
    {
        double kmph,mps;
        int ch;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("\n1.kmph to mps"+
            "\n2.mps to kmph"+
            "\nEnter your choice:");
            ch=in.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.println("Enter the kmph:");
                    kmph = in.nextDouble();
                    mps = kmphToMps(kmph);
                    System.out.println(mps+"mpss");
                    break;
                case 2:
                    System.out.println("Enter the mps:");
                    mps = in.nextDouble();
                    kmph = mpsTokmph(mps);
                    System.out.println(kmph+"kmph");
                    break;
                case 3:
                    System.out.println("Exiting program!!!");
                    System.exit(0);
                default:
                    System.out.println("Wrong Input! Try Again.");
                    break;
            }
        }while(ch!=3);
    }

   
}
