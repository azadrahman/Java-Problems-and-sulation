
package Thread_1;

public class Main {
    public static void main(String ar[]){
        Test t=new Test();
        Thread obj= new Thread(t);
        obj.start();
        for(int i=1; i<=5; i++){
            System.out.println("Main Thread");
        }
    }
}
