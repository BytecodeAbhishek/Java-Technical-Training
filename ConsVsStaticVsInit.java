// static block vs init block
// 
class ParentInit{
    static int x ;
    static{
        x = 20;
        System.out.println("parent class static block");
    }
    static{
        x = 30;
        System.out.println("parent class static block 2");
    }
    {
        System.out.println("parent Init block");
    }
    ParentInit(){
        System.out.println("parent constructor");
    }
}
class ChildInit extends ParentInit{
    static int y ;
    static{
      y = x+2;
      System.out.println("child class static block");
    }
    static{
        y = x+2;
        System.out.println("child class static block 2");
    }
    {
        System.out.println("child Init block");
    }
    ChildInit(){
        // super() // will call parent class cons
        System.out.println("child constructor");
    }
}
class Q{
    static int a; // Eager Binding , Eager Loading
    int b; // Intance variable , During object creation (Lazy Loading ...)
    {
        // Init block
        System.out.println("Pre constructor call ... ");
        b =1000;
    }
    Q(){
        System.out.println("I am the constructor during object creation");
        b =10;
    }
    {
        // Init block
        System.out.println("Pre constructor call2 ... ");
        b =2000;
    }
    static{
        a = 100;
        System.out.println("Static block will execute ehile class loading");
    }
    static{
        a = 200;
        System.out.println("Another static block");
    }
    static void show(){
        System.out.println(" a is : "+a);
    }
}
public class ConsVsStaticVsInit {
    public static void main(String[] args) {
        //Q.show();
        //Q obj1 = new Q();
        //Q obj2 = new Q();
        ChildInit obj = new ChildInit();
    }
}
