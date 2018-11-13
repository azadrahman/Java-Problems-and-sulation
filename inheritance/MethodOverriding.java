package inheritance;

public class MethodOverriding {
 int x=10;
 void disp(){
     System.out.println("Super "+x);
 }
}
class Sub extends MethodOverriding{
    int y=20;
   void disp(){
       System.out.println("Super "+x);
       System.out.println("Sub "+y);
   }  
}
class Main3{
    public static void main(String ar[]){
        Sub obj= new Sub();
        obj.disp();
    }
}