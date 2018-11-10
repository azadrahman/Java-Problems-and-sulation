
package staticmember;

public class StaticMember {

   static int cube(int x)
   {
       return (x*x*x);
   }
}
class Main{
    public static void main(String ar[])
    {
        int res= StaticMember.cube(5);
        System.out.println("Cube is "+res);
    }
}