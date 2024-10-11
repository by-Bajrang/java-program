class superr
{
    public void display()
    {
        System.out.println("superr Display");
    }
}
class sub extends superr
{
    @Override
    public  void display()
    {
        System.out.println("sub Display");
    }
}
public class inheritance13 {
    public static void main(String[] args)
    {
         sub s = new sub();
    }
}



