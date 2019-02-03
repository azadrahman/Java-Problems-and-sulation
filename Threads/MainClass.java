
package Threads;

public class MainClass {
   public static void main(String ar[]){
       A obja= new A();
       B objb= new B();
       obja.start();
       objb.start();
   } 
}
