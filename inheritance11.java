class supeer
{
    public void meth1()
    {
       System.out.println("supeer meth1");
    }
    public void meth2()
    {
        System.out.println("supeer meth2");
    }
}
class sub extends supeer
{
    public void meth2()
    {
        System.out.println("sub meth2");
    }
    public void meth3()
    {
        System.out.println("sub meth3");
    }
}

public class inheritance11 {
    
    public static void main(String[] args)
    {
        // sub s = new sub();
        // s.meth1();
        // s.meth2();
        // s.meth3();
        
        supeer s = new sub();
        s.meth1();
        s.meth2(); // overrided methode
        // s.meth3(); beacuse meth3 is not present in refference class supper samja kya
    
    }
}
