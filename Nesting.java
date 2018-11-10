package nestingmethod;
public class Nesting {
 int m,n;
 Nesting(int x, int y)
 {
     m=x;
     n=y;
 }
 int largest()
 {
   if(m>n)
   {
       return m;
   }
   else
   {
       return n;
   }
 }
 void disp()
 {
     int res= largest();
     System.out.println("Largest Number is "+res);
 }
}
class Main{
    public static void main(String ar[]){
        Nesting obj= new Nesting(10,20);
        obj.disp();
    }
     }