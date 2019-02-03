/* take 2 integer input from keyboard. your program should 
determine whether the first number is a multiple of the
second number.
i) if any two number is negative
ii)if the first numberis smaller than second number
iii)if the second number is zero.
*/
package Exception_handling;
import java.util.Scanner;
public class NegativeNumberException1 extends Exception {
    int a;
    NegativeNumberException1(int x){
        a=x;
    }
    public String toString(){
        return "Error!! Invalid Number: "+a;
    }
}
class InvalidFirstNumberException extends Exception{
    public String toString(){
        return "Error!! First number is smaller than second number.";
    }
}
class InvalidSecondNumberException extends Exception{
    public String toString(){
        return "Error!! Second number is equal to zero.";
    }
}
class TestMultiple{
    static void check(int n1, int n2) throws NegativeNumberException1, InvalidFirstNumberException, InvalidSecondNumberException{
        if(n1<0){
            throw new NegativeNumberException1(n1);
        }
        else if(n2<0){
            throw new NegativeNumberException1(n2);
        }
        else if(n1<n2){
            throw new InvalidFirstNumberException();
        }
        else if(n2==0){
            throw new InvalidSecondNumberException();
        }
    }
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();
        try{
            check(n1,n2);
            if(n1%n2 ==0){
               System.out.println(n1+" is a multiple of "+n2); 
            }
            else{
                System.out.println(n1+" is not a multiple of "+n2);
            }
        }
        catch(NegativeNumberException1 ex){
            System.out.println(ex);
        }
        catch(InvalidFirstNumberException ex){
            System.out.println(ex);
        }
        catch(InvalidSecondNumberException ex){
            System.out.println(ex);
        }
    }
}