
package String;
class String_Test {
    public static void main(String ar[]) {
	String str1= "EasyForLearn";
	String str2= new String("Java");
	String str3= new String(str2);
	char name[]= {'A','R','J','O'};
	String str4= new String(name);
	String str5= new String(name,1,3);
	String str6= new String(str5);
	System.out.println("\n\t1st String: "+str1);
	System.out.println("\n\t2nd String: "+str2);
	System.out.println("\n\t3rd String: "+str3);
	System.out.println("\n\t4th String: "+str4);
	System.out.println("\n\t5th String: "+str5);
	System.out.println("\n\t6th String: "+str6);
	System.out.println("\n\tLength of 1st string: "+str1.length());

}
}
