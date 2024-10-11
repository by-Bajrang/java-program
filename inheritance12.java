class A {}
class B extends A {}

class superr
{
    public A display()
    {
        System.out.println("superr Display");
        return new A();
    }
}
class sub extends superr
{
    @Override
    public B display()
    {
        System.out.println("sub Display");
        return new B(); // return type is different par 
        // fir bhi allowed hai for overriding samja kya
    }
}
public class inheritance12 {
    
}
