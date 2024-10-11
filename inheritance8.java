
class superr
{
    public void display()
    {
        System.out.println("hello");
    }
}
class subb extends superr
{
    public void display()
    {
        System.out.println("hello world");
    }
    
}
public class inheritance8 {
    
    public static void main(String[] args)
    {
        superr s = new subb();
        s.display();
    }
}
