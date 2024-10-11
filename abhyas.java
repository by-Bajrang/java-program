class rectangle 
{
    private double length;
    private double breath;
    
    public  rectangle()
    {
       length = 1;
       breath = 1;
    }
    public rectangle(double l, double b)
    {
        if(length >= 0)
        {
            length = l;
        }
        else
        {
            length = 0;
        }
        if(breath >= 0)
        {
            breath = b;
        }
        else
        {
            breath = 0;
        }
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        length = l;
    }
    public double getBreath()
    {
        return breath;
    }
    public void setBreath(double b)
    {
        breath = b;
    }
   
    public double area()
    {
        return length * breath;
    }
    public double perimeter()
    {
        return 2*(length + breath);
    }
}

public class abhyas {
    public static void main(String[] args)
    {
       rectangle r1 = new rectangle();
    //    rectangle r1 = new rectangle(3,5);

       r1.setLength(10);
       r1.setBreath(15);
       System.out.println("Area of rectangle is >> " + r1.area() );
       System.out.println("perimeter of rectangle is >> " + r1.perimeter() );

    }
}
