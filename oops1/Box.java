package oops1;
public class Box {
    int l, b, h;
    //constructor
    Box()
    {
        this.l=1;
        this.b=1;
        this.h=1;
    }
    Box(Box other)
    {
        this.l=other.l;
        this.b=other.b;
        this.h=other.h;
    }
    Box(int l, int b, int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void info()
    {
        System.out.println("length is "+l+"\n"+" breadth is "+b+"\n"+" height is "+h);
    }
    public static void main(String[] args)
    {
        //
        Box box1= new Box(24,26,48);
        Box box2= new Box();
        box1.info();
        box2.info();
    }
   

    
}
