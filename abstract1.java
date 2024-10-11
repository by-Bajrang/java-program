abstract class superr
{
    public superr()
    {
        System.out.println("super constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of super");
    }
    abstract public void meth2();
}
class sub extends superr
{
    @Override
    public void meth2()
    {
        System.out.println("Meth2 of sub");
    }
}

public class abstract1 {
    
    public static void main(String[] args)
    {
        superr s = new sub();
        s.meth1(); 
        s.meth2();
    }
}
