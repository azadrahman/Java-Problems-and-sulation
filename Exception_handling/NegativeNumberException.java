/* UserdefineException in java. in this program, some integer number are taken from keyboard
and if any negative integer number is found then a user-define exception 
named NegativeNUmberException is thrown. At the end the summation 
of the integers are printed.
*/
package Exception_handling;
import java.util.Scanner;
public class NegativeNumberException extends Exception{
    String a;
    NegativeNumberException(String x){
        a=x;
    }
    public String toString(){
        return "Error!! Negative Number Found: "+a;
    }
}
class UserDefineException{
    static int check(int x) throws NegativeNumberException{
        if(x<0){
            throw new NegativeNumberException(Integer.toString(x));
        }
        else{
            return x;
        }
    }
    public static void main(String ar[]){
        Scanner in= new Scanner(System.in);
        int sum=0;
        try{
            while(in.hasNextInt()){
                sum+=check(in.nextInt());
            }
        }
        catch(NegativeNumberException e){
            System.out.println(e);
        }
        System.out.println(sum);
    }
}