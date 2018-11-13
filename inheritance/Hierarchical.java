package inheritance;

public class Hierarchical {
 int x=10,y=20;
 void disp()
 {
     System.out.println("Method of Class One or Super class");
     System.out.println("Value of x is: "+x);
     System.out.println("Value of y is: "+y);
 }
}
class Two extends Hierarchical{
    void add(){
        System.out.println("Method of class two or sub-class");
        System.out.println("Addition Is: "+(x+y));
    }
}
class Three extends Hierarchical{
    void mult(){
        System.out.println("Method of class three or sub-class");
        System.out.println("Multiplication is: "+(x*y));
    }
}
class Main2{
    public static void main(String ar[]){
    Two obj1= new Two();
    Three obj2= new Three();
    obj1.disp();
    obj1.add();
    obj2.mult();
    }
}