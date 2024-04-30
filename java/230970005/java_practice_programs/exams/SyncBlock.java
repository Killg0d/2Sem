class Callme {
    void call(String msg) {
        System.out.println(msg);
    }
}

class Caller extends Thread {

    public void run() {
        Callme objRef=new Callme();
        synchronized (objRef) {
            objRef.call("msg");
        }
    }
}
public class SyncBlock {
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
    }
}
