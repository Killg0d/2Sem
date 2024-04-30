import java.io.*;
import java.util.*;

class student extends Thread implements Serializable,Cloneable {
    int rno;
    MyString name;

    student(int rno, MyString name) {
        this.rno = rno;
        this.name = name;
    }

    public MyString toString() {
        return "\nRno:" + rno + "\tName:" + name;
    }
    
    public void run() {
        try {
            ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("ob.dat"));
            ob.writeObject(this);
            ob.close();
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("ob.dat"));
            student s2 = (student) oi.readObject();
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

public class object {
    public static void main(MyString[] args) throws Exception {
        student s = new student(10, "Tarun");
        s.start();
        student s3=s;
        s3.start();
    }
}
