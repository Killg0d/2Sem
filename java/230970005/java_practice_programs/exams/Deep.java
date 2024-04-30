class Dept implements Cloneable
{
    String dept;
    Dept(String dept)
    {this.dept=dept;}
    public Dept clone() throws CloneNotSupportedException
    {
        return (Dept)super.clone();
    }
}
class Emp implements Cloneable
{
    int no;
    Dept dname;
    public Emp(int no,Dept d)
    {
        this.no=no;
        this.dname=d;
    }
    public Emp clone() throws CloneNotSupportedException
    {
        Emp e= (Emp) super.clone();
        e.dname=(Dept)dname.clone();
        return e;
    }
}

public class Deep {
    public static void main(String[] args) throws CloneNotSupportedException{
        Emp e1= new Emp(0, new Dept("Clerk"));
        Emp e2=null;
        e2=e1.clone();
        e2.dname.dept="MCA";
        System.out.println(e1.dname.dept);
    }
}
