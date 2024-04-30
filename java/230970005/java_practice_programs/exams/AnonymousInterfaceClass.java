
interface InnerAnonymousInterfaceClass {

    public void print();
}

public class AnonymousInterfaceClass
{
    public void addprint(InnerAnonymousInterfaceClass i){i.print();}
    public static void main(String[] args) {
        AnonymousInterfaceClass a = new AnonymousInterfaceClass();
        a.addprint(new InnerAnonymousInterfaceClass() {
            public void print()
            {
                System.out.println("Hello World");
            }
        });
    }
}