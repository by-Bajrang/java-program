class subject
{
    private String subID;
    private String name;
    private int maxMark;
    private int marksObtain;

    public subject()
     {
        subID = "AB235DFF";
        name = "java";
        maxMark = 100;
        marksObtain = 80;
     }
     public subject(String subID, String name, int maxMark, int marksObtain)
     {
        this.subID = subID;
        this.name = name;
        this.maxMark = maxMark;
        this.marksObtain = marksObtain;
        this.maxMark = maxMark;
     }
     public String getsubID()
     {
        return subID;
     }
     public String getname()
     {
        return name;
     }
     public int getmaxMark()
     {
        return maxMark;
     }
     public int getmarksObtain()
     {
        return marksObtain;
     }
     public void setsubID(String subID)
     {
        this.subID ="WEEE234E";
     }
     public void setname(String name)
     {
        this.name = "python";
     }
     public void setmaxMark(int maxMark)
     {
        this.maxMark = 150;
     }
     public void setmarkObtain(int marksObtain)
     {
        this.marksObtain = 69;
     }
     boolean isQualified()
     {
        return marksObtain >= maxMark/10*4;
     }
     public String toString()
     {
        return "\n subjectID >> "+subID+"\n name >> "+name+"\n maxmark >> "+maxMark+"\n marksObtain >> "+marksObtain+"\n qualified >> "+isQualified();
     }
}

public class setMarkObtain {
  
   public static void main (String[] args)
   {
    // subject s = new subject();
    // System.out.println(s.isQualified());
    // or
    subject sub[] = new subject[3];
    sub[0]  = new subject("s101","KS",100,2);
    sub[1]  = new subject("AE1200UE","python",80,47);
    sub[2]  = new subject("sw23","DS",150 ,23);

    for(subject s:sub)
    {
        System.out.println(s);
    }
   }
}
