import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

class StackEg
{
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(10);
        System.out.println(s.pop());
        if(!s.empty())
        {
            System.out.println(s.peek());
        }
        s.push(50);
        s.push(40);
        s.push(55);
        s.sort((obj1,obj2)->obj1.compareTo(obj2));
        System.out.println(s);
    }
}

public class ArrayListString {

    public static void main(String[] args) {
        
        String s[]={"HEllo","World","Apple"};
        Arrays.sort(s);
        Vector<String> a=new Vector<>();
        
        a.add("Ravi");
        a.add("Ravish");
        a.add("Ram");
        System.out.println(a);
        a.sort((str1,str2)->str1.compareTo(str2));
        a.remove(1);
        System.out.println(a);
        for(String s1:a)
        System.out.println(s1);
        ListIterator<String> li = a.listIterator();
        while(li.hasNext()){
            li.set(li.next()+"Hello");
            
        }
        Arrays.fill
        while(li.hasPrevious())
            System.out.println(li.previous());   
          
    }
}