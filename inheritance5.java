class rectangle
{
    int length;
    int breadth;
    rectangle(int length,int breadth)
    {
        //length = length; this will create confusion between instance variable and local variable that why we use this keyword
        this.length = length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println("Length is >>"+this.length);
        System.out.println("Breadth is >>"+ this.breadth);
    }
}

public class inheritance5 {
    
}
