
package String;

class String_Concatenation {
    public static void main(String ar[]) {
	String str1= "EasyForLearn"+" Foryou";
	String str2= str1+" Channel";
	String str3= str1+str2;
	int no=50;
	String str4= no+10+str1;
	String str5= str1+no+20;
	String str6= str1.concat(" Channel");
	String str7= "My".concat(str6);
	System.out.println("String 1: "+str1);
	System.out.println("String 2: "+str2);
	System.out.println("String 3: "+str3);
	System.out.println("String 4: "+str4);
	System.out.println("String 5: "+str5);
	System.out.println("String 6: "+str6);
	System.out.println("String 7: "+str7);
	System.out.println("Length of String 1: "+str1.length());
	System.out.println("Length of String 6: "+str6.length());
}
}
