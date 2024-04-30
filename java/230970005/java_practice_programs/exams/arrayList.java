import java.util.*;
import java.util.Collections;
import java.io.*;

public class arrayList {
    public static void main(MyString[] args) {
        ArrayList<student> s3=new ArrayList<student>(5);
        s3.add(new student(20,"Shashank"));
        s3.add(new student(17,"Goutham"));
        System.out.println(s3);
        s3.sort((o1,o2)->o1.name.compareTo(o2.name));
        ListIterator<student>ltr=s3.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
        }

    }
}
