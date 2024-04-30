import java.util.Random;

class MyThread extends Thread
{
    int a[];
    MyThread(String s,int[] a)
    {
        this.setName(s);
        this.a=a;
    }
    public void run()
    {
        if(this.getName().equals("Fact"))
        {
            for(int i=0;i<a.length;i++)
            {
                int fact=1;
                for(int j=1;j<=a[i];j++)
                {
                    fact*=j;
                }
                System.out.println("Fact of "+a[i]+" = "+fact);
            }
        }
        else
        if(this.getName().equals("Even"))
        {
            for(int i=0;i<a.length;i++)
            if (a[i]%2==0) {
                System.out.println(a[i]+" is even");
            }
        }
        else if (this.getName().equals("Odd")) 
        {
            for(int i=0;i<a.length;i++)
            if (a[i]%2!=0) {
                System.out.println(a[i]+" is odd");
            }
        }

    }
}

public class MyRandom {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++)
            a[i] = new Random().nextInt(10);

        MyThread t1=new MyThread("Fact",a);
        MyThread t2=new MyThread("Even",a);
        MyThread t3=new MyThread("Odd",a);
        t1.start();
        t2.start();
        t3.start();
    }

}
