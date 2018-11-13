package inheritance;

public class SimpleInheritance {
int a,b;
void getdata(int x, int y)
{
    a=x;
    b=y;
}
int add()
{
    System.out.println("Super Class Method");
    return(a+b);
}
}
class B extends SimpleInheritance{
int mult()
{
    System.out.println("Sub CLass Method");
    return(a*b);
}
}
class Main{
    public static void main(String ar[]){
        B obj= new B();
        int add,mult;
        obj.getdata(5,3);
        add= obj.add();
        mult= obj.mult();
     System.out.println("Addition "+add);
     System.out.println("Multiple "+mult);
    }
}