class TV
{
    public void switchon()
    {
        System.out.println("TV is switched on ");
    }
    public void changeChannel()
    {
        System.out.println("TV Channel is changed");
    }
}
class  SmartTV extends TV
{
    public void switchon()
    {
        System.out.println("Smart TV is switched on ");
    }
    public void changeChannel()
    {
        System.out.println("Smart TV Channel is changed");
    }
    public void browse()
    {
        System.out.println("Smart TV is browsing");
    }
}

public class inheritance9 {
    
    public static void main(String[] args)
    {
        // TV t = new TV();
       
        TV t = new SmartTV();// hum smart tv ko tv khe sakthe hai par tv ko smart tv nahi khe sakthe
        // there for neche wale line error aayega
        // SmartTV st = new TV();
        t.switchon();
        t.changeChannel();
        //t.browse();// ha object ke method call hote hai par vahi methode jo refference mai define hai samja kya

    }
}
