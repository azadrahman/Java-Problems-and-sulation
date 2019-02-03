
package Exception_handling;

public class CatchingInvalid {
    public static void main(String ar[]){
        int valid=0, invalid=0, no;
        for(int i=0; i<ar.length; i++){
            try{
              no= Integer.parseInt(ar[i]); 
            }
            catch(NumberFormatException e){
              invalid = invalid+1;
              System.out.println("Invalid Number: "+ar[i]);
              continue;
            }
            valid= valid+1;
        }
       System.out.println("Valid are: "+valid);
       System.out.println("Invalid are: "+invalid);
    }
}
