class Outer_Demo {
    int num=20;
    // inner class
    private class Inner_Demo {
       public void print() {
          System.out.println("This is an inner class"+num);
       }
    }
    //Accessing the inner class from the outer class method within
    void display_Inner() {
       Inner_Demo inner = new Inner_Demo();
       inner.print();
    }
 }
 public class My_class extends Outer_Demo.Inner_Demo {
    public static void main(String args[]) {
       //Instantiating the outer class
       My_class outer = new My_class();
       
       
       //Accessing the display_Inner() method.
       outer.display_Inner();
    }
 }
 