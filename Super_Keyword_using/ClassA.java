
package Super_Keyword_using;

class ClassA {
    int no;
void message() {
	System.out.println("No. in super class "+no);
}
	
}
class ClassB extends ClassA{
	int no;
	ClassB(int x, int y){
		super.no=x;
		 no=y;
	}  
	void message() {
		System.out.println("No. in sub class :"+no);
	}
	void disp() {
		super.message();
		message();
	}
}
class MainClass{
	public static void main(String ar[]) {
		ClassB obj= new ClassB(100,200);
		obj.disp();
	}
}
