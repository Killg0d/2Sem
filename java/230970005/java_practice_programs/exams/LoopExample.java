class ownException
{
    public static void throwExcep()
    {
        try
        {throw new Exception();}
        catch(Exception e)
        {
            System.out.println("Exception occured");;
        }
    }
}

public class LoopExample {
    public static void main(String[] args) {
        ownException.throwExcep();
    }
}
