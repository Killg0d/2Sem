class Even implements Runnable
{
    int a[];
    int count;
    Thread t;
    Even(){}
    Even(String even,int a[]){
        t=new Thread(this,even);
        this.a=a;
        t.start();
        
    }
    public void run()
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                count++;
                System.out.println("Even "+a[i]);
            }
        }
    }
}
class Odd implements Runnable
{
    int a[];
    int count;
    Thread t;
    Odd(String even,int a[]){
        Thread t=new Thread(this,even);
        t.start();
        this.a=a;
    }
    public void run()
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                count++;
                System.out.println("Odd "+a[i]);
            }
        }
    }
}
public class Even_Odd {
    public static void main(String args[])
    {
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=i;
        Even e=new Even("Even",a);
        Odd o=new Odd("Odd",a);
        try
        {
            e.join();
            o.join();
        }
        catch(Exception ec)
        {
            System.out.println("Exception occoured:"+ec);
        }
        System.out.println("Even count"+e.count);
        System.out.println("Odd count"+o.count);

    }
}
