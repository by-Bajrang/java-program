class phone 
{
    public void call()
    {
        System.out.println("phone call");
    }
    public void sms()
    {
        System.out.println("phone sending sms");
    }
}
interface  Icamera
{
    void click();
    void record();
}
interface Imusic 
{
    void play();
    void pause();
}

class smartphone extends phone implements Icamera,Imusic
{
    public void videocall()
    {
        System.out.println("smart phone cideo calling");
    }
    public void click()
    {
        System.out.println("smart phone clicking photo");
    }
    public void record()
    {
        System.out.println("smart phone recording video");
    }
    public void play()
    {
        System.out.println("smart phone playing music");
    }
    public void pause()
    {
        System.out.println("smart phone pausing music");
    }

}

public class interface2 {
    
    public static void main(String[] args)
    {
       // smartphone sp = new smartphone();
        Icamera sp = new smartphone();
        //sp.call();
        //sp.sms();
        sp.click();
        //sp.play();

        // Imusic sp = new smartphone();
        // //sp.call();
        // //sp.sms();
        // //sp.click();
        // sp.play();
    }
}
