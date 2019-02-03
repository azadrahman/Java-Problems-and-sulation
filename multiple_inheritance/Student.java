
package multiple_inheritance;

public class Student {
    int m1,m2;
    void getmarks(int x, int y){
        m1=x;
        m2=y;
    }
    void putmarks(){
        System.out.println("First :"+m1);
        System.out.println("Second :"+m2);
    }
}
