/**
 * Input
 */
class Input extends Thread{
    int a[];
    Input(String s,int ac[])
    {
        this.setName(s);
        a=ac;
    }    
    public void run()
    {
       for(int i=0;i<5;i++)
            a[i]=i+15;
    }
}
class Sort extends Thread{
    int a[];
    Sort(String s,int a[])
    {
        this.a=a;
        this.setName(s);
    }
    public void run()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<5-i-1;j++)
            {
                if(a[j]<a[j]+1)
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Priority"+getPriority());

    }
}
public class Main {
    public static void main(String[] args) {
        int a[]=new int[5];
        Input in=new Input("Array", a);
        Sort s=new Sort("Sort", a);
        in.start();
        in.setPriority(10);
        s.start();
        s.setPriority(8);
        
        
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        } 
    }
}