class parent
{
    parent() // non parameterized constructor
    {
        System.out.println("Non-param of parent");
    }
    parent(int x) //parameterized constructor
    {
        System.out.println("param of parent "+x);
    }
}
class child extends parent
{
    child()
    {
        System.out.println("Non-param of child");
    }
    child(int y)
    {
        System.out.println("param of child");
    }
    child(int x,int y)
    {
        super(x);// is used to call parameterized constructor of parent class
        System.out.println("2 param of child "+y);
    }
}

public class inheritance3 {
    
    public static void main(String[] args)
    {
        child c = new child(10,20);
    }
}
