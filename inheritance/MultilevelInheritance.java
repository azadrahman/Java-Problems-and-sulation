package inheritance;

public class MultilevelInheritance {
    int roll;
    void getroll(int x)
    {
        roll=x;
    }
    void putroll()
    {
        System.out.println("Roll Number "+roll);
    }
}
class Test extends MultilevelInheritance{
    int mark1,mark2;
    void getmark(int x, int y)
    {
        mark1=x;
        mark2=y;
    }
    void putmark(){
        System.out.println("Test No. 1: "+mark1);
        System.out.println("Test No. 2: "+mark2);
    }
}
class Result extends Test{
    int total;
    void disp(){
        putroll();
        putmark();
        total= mark1+mark2;
        System.out.println("Total marks: "+total);
    }
 }
class Main1{
    public static void main(String ar[]){
        Result obj= new Result();
        obj.getroll(101);
        obj.getmark(80,85);
        obj.disp();
    } 
}