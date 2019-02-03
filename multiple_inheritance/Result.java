
package multiple_inheritance;

public class Result extends Student implements Sport {
    int total;
    public void spmarks(){
        System.out.println("Sport marks: "+sp);
    }
    void disp(){
        putmarks();
        spmarks();
        total = m1+m2+sp;
        System.out.println("Total: "+total);
    }
}
