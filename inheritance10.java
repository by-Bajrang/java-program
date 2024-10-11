class car
{
    public void start()
    {
        System.out.println("car is started");
    }
    public void accelerate()
    {
        System.out.println("car is accelerating");
    }
    public void changeGear()
    {
        System.out.println("car Gear is changed");
    }
}
class Luxurycar extends car
{
    public void changeGear()
    {
        System.out.println("Automatic Gear change");
    }
    public void openRoof()
    {
        System.out.println("sun roof is opened");
    }
}

public class inheritance10 {
    
    public static void main(String[] args)
    {
        car l = new Luxurycar();
        l.start();
        l.accelerate();
        l.changeGear();
        // l.openRoof();
    }
}
