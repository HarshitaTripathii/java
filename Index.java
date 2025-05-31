public class Index {
    static  class Student{
        static int count=0;
        int rollNo;
        String name;
        // Constructor 
        Student(int r, String n){
            count++;
            this.rollNo=r;
            this.name=n;
        }
        // Student(){
        //     this.name="Unknown";
        //     this.rollNo=1;
        // }
        void greet()
        {
            System.out.println("hello" + this.name);
        }

        void changeName(String nme){
            this.name=nme;
        }

        Student (Student other){
            this.name=other.name;
            this.rollNo=other.rollNo;  //  
        }

        // calling constructor from another constructor
        Student (){
            this (94, "Harshit");
        }
    }
    public static void main(String[] args)
    {
        Student s1=new Student(933, "Harshita");
        
        System.out.println(s1);
        System.out.println(s1.name);
        s1.greet();

        Student s2= new Student();
        System.out.println(s2.name);
        s2.greet();
        s2.changeName("Riya");
        s2.greet();

        Student s3= new Student(s2);   // Student (Student other){} this constructor has been called where, this. is for s3 and other. is for s2
        System.out.println("My new name is " + s3.name);
        
    }
    
}
