public class  generic <T,V>{
 T obj1;
 V obj2;
 generic(T a,V b)
 {
    obj1=a;
    obj2=b;
 }   
 public T getObj1() {
     return obj1;
 }
 public V getObj2() {
     return obj2;
 }
    public static void main(String[] args) {
        generic<Integer,String> g = new generic<Integer,String>(88,"Hello");
        System.out.println(g.getObj2());
        System.out.println(g.getObj1());
        }    
}

