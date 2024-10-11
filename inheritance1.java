class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class cylinder extends circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
public class inheritance1 {
    
    public static void main(String[] args)
    {
        cylinder c1 = new cylinder();
        c1.radius = 7;
        c1.height = 10;
        System.out.println("vol. of cylinder is >> "+
        c1.volume());
        System.out.println("area >> "+c1.area());
        
    }
}
