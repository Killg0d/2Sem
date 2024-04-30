class MyThread implements Runnable
{
    MyThread()
    {
        Thread t = new Thread(this,"new");
        t.start();
        
        System.out.println(t.isAlive());
    }
    @Override
    public void run() {
        for(int i =0 ;i < 5; i++)
        try{
            System.out.println(i);
            Thread.sleep(1000);
        }catch(Exception e){}
        Thread.currentThread().getName();
    }
    public void display(){
        for(int i =0 ;i < 5; i++)
        try{
            System.out.println(i);
            Thread.sleep(1000);
        }catch(Exception e){}
        Thread.currentThread().getName();
    }
}
public class classRunnable {

    public static void main(String[] args) throws Exception {
        MyThread t=new MyThread();
        Thread.sleep(1000);
        t.display();
      
    }
}
