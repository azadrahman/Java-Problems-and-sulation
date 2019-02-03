
package Threads;

public class B extends Thread {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("From Thread B: "+i);
            System.out.println("Exit From B");
        }
    }
}
