/*
take n size array as input and print all putting values 
of array. finally print the sum of the array[n_size]
*/
package Array_demo;
import java.util.Scanner;
public class Array {
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n= sc.nextInt();
        int marks[]= new int [n];
        System.out.println("Array length: " +marks.length);
        System.out.println("Enter "+n+" Elements");
        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextInt();
        }
        int total=0;
        System.out.println("Elements are: ");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
            total=total+marks[i];
        }
        System.out.println("Total :"+total);
    }
}
