abstract class shape
{
    abstract public double perimeter();
    abstract public double  area();
}
class Circle extends shape
{
    double radius;
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
class rectangle extends shape
{
    double length;
    double breadth;
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
}
public class abstract2 {
    public static void main(String[] args)
    {
        rectangle r = new rectangle();
        r.length = 10;
        r.breadth = 20;
        System.out.println("perimeter of rectangle is >> "+r.perimeter());
        System.out.println("area of rectangle is >> "+r.area());
    }
}
