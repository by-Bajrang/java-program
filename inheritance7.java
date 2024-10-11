class superr
{
    int x = 20;
    public void display()
    {
        System.out.println("hello");
    }
}
class subb extends superr
{
    int x = 10;
    // public void display()
    // {
    //     System.out.println("hello world");
    // }
    public void display()
    {
        System.out.println(super.x);// super keyword is used to access the super class variable
        System.out.println(x);
    }
}

public class inheritance7 {
    
    public static void main(String[] args)
    {
        subb s = new subb();
        s.display();
    }
}
