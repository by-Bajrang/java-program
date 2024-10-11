class parent
{
    public parent() //constructor
    {
        System.out.println("parent constructor");
    }
}

class child extends parent
{
    public child() //constructor
    {
        System.out.println("child constructor");
    }
}

class grandchild extends child
{
    public grandchild() //constructor
    {
        System.out.println("grandchild constructor ");
    }
}
public class inheritance2 {
    
    public static void main(String[] args)
    {
        // parent p = new parent();
        grandchild c = new grandchild();
    }
}
   