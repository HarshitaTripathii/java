package oops1;

public class Boxw extends Box {
    int bw;
    Boxw(int l, int b,int h,int bw)
    {
        // super( arg ) is called to call superClass Constructor
        super(l,b,h);
        this.bw=bw;
    }
     void display()
    {
        System.out.println(b);
        System.out.println(bw);
        // System.out.println(l);  //error
    }

    public static void main(String[] args)
    {
        Boxw bw1=new Boxw(10,20,30,40);
        System.out.println("length is "+bw1.b);
    }
    
    
    
}
