class rectangle 
{
    int length;
    int breadth;
    public  rectangle()
    {
        length = 1;
        breadth =1;
    }
    public rectangle(int l,int b)
    {
        length = l;
        breadth = b;
    }
}
class cuboid extends rectangle
{
    int height;
    public cuboid()
    {
        height = 1;
    }
    public cuboid(int l,int b ,int h)
    {
        super(l,b);
        height =h;
    }
    public int  volume()
    {
        return length*breadth*height;
    }
}
public class inheritance6 {
    
    public static void main(String[] args)
    {
        cuboid c = new cuboid(3,4,7);
        System.out.println("volume is >> "+c.volume());
    }
}
