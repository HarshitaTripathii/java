import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        {
            /* 
            Scanner inp1=new Scanner(System.in);
            System.out.println((inp1.nextInt()));  // integers input only
            System.out.println((inp1.next())); // string
            System.out.println((inp1.nextLine())); // line
            */

            Scanner inp2= new Scanner(System.in);
            String nme= inp2.next();
            System.out.println(String.format("hello %s !", nme));
            // System.out.println("hello Harshita");
            // System.out.println("hello World");
            // System.out.println(args[1]);
        }
    }
    
}
/* 
public class Example {
    static int staticVar = 10;       // Static variable
    int instanceVar = 20;            // Non-static variable

    // Static method
    public static void staticMethod() {
        System.out.println(staticVar);    // Works (static accesses static)

        //  Direct access to non-static fails:
        // System.out.println(instanceVar); // ERROR!

        //  Solution: Create an object first!
        Example obj = new Example();
        obj.instanceMethod();       // Now works! (via object)
    }

    // Non-static method
    public void instanceMethod() {
        System.out.println("InstanceVar: " + instanceVar);  // Works
        System.out.println("StaticVar: " + staticVar);       // Also works
    }

    public static void main(String[] args) {
        staticMethod();  // Calls staticMethod(), which creates an object and calls instanceMethod()
    }
}
    */