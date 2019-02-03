
package Super_Keyword_using;

public class SuperKey_Using {
      int a;
    SuperKey_Using(int x){
    	a=x;
    	System.out.println("Value of super class: "+a);
    }
	
	}
 class Sub_Using extends SuperKey_Using{
	 int b;
	 Sub_Using(int x, int y){
		 super(x);
		 b=y;
		 System.out.println("Value of sub class: "+b);
	 }
 }
class MainTest{
	public static void main(String ar[]) {
		Sub_Using obj= new Sub_Using(100, 200);
	}
}
