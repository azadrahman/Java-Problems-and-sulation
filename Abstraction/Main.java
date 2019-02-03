
package abstraction;

public class Main {
    public static void main(String ar[]){
        MobileUser mu;
        mu= new Rahim();
        mu.call();
        mu.sendMessage();
        mu= new Karim();
        mu.sendMessage();
    }
}
