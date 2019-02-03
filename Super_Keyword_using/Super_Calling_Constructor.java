
package Super_Keyword_using;

public class Super_Calling_Constructor {
    int a;
Super_Calling_Constructor(){
	System.out.println("Constructor in super class");
}

}
class Sub extends Super_Calling_Constructor{
	Sub(){
		System.out.println("Constructor in sub class");
	}
}
class Test{
	public static void main(String ar[]) {
		Sub obj= new Sub();
	}
}
