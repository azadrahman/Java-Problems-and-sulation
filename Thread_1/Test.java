
package Thread_1;

public class Test implements Runnable {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Test Thread");
        }
    }
}
