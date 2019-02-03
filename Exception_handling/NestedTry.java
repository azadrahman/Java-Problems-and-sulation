/* write a code that take some input and generate the given exception
1. NumberFormatException handle
2. ArithmeticException handle
*/
package Exception_handling;

public class NestedTry {
    public static void main(String ar[]){
        int a,b, ans;
        try{
            a= Integer.parseInt(ar[0]);
            b= Integer.parseInt(ar[1]);
            try{
                ans= a/b;
             System.out.println("Result: "+ans);
            }
            catch(ArithmeticException e){
                System.out.println("Division by Zero");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Incorrect Argument Type!");
        }
    }
}
