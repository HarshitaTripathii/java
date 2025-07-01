package oops1;
// non static class : can contain static and non static both
public class Packages1 {

    // static variable
    static int stat=10;

    //non static variable
    int nstat=20;

    // static method
    static void statMethod()
    {
        System.out.println("i am Static method");
        System.out.println("i am Static method " + stat);
        // can access directly, non static variable
        Packages1 obj1= new Packages1();
        System.out.println("number is  "+ obj1.nstat);
        // obj1.nstatMethod();
        // nstatMethod();  // error
    }

    // non static method
    void nstatMethod()
    {
        System.out.println("i am Non Static");
        //accessed non static variable and static variable
        System.out.println("i am Non Static " + stat);
        System.out.println("i am Non Static " + nstat);
        System.out.println("below is static method");
        // statMethod();
    }
    public static void main(String[] args)
    {
        // this is static main fxn, it cannt access non static method directly
        statMethod();
        Packages1 obj2=new Packages1();
        obj2.nstatMethod();
        // nstatMethod();    // throws error

    }
}

