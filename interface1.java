interface test
{
    void meth1();
    void meth2();
}
// ye sahi hai neche wala
//abstract class my implements test
//{
//    
//}
class my implements test// ye galath hai kuki abhi humne meth1 and methw ko define nahi kiya hai par agar hum class ke agye abstract likh de toh error nahi aayega
{
    public void meth1()
    {
        System.out.println("meth1 of class my >> ");
    }
    public void meth2()
    {
        System.out.println("meth2 of class my >> ");
    }
    public void meth3()
    {
        System.out.println("meth3 of class my >> ");
    }
}

public class interface1 {
    
    public static void main(String[] args)
    {
        test t1;//refference of interface
        test t = new my();
        t.meth1();
        t.meth2();
    }
}
