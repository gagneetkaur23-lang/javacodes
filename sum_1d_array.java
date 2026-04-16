import java.io.*;
import java.util.Scanner;

public class sum_1d_array {
    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a size of array");
        int size= sc.nextInt();   //size input

    int []arr=new int[size];     // array declare
    int sum=0;         // sum=0
   //array input from user
   for(int i=0;i<arr.length;i++){
    System.out.println("enter array elements");
    arr[i]= sc.nextInt();
}
    
//array traverse means print
for(int i=0;i<arr.length;i++){
    sum= sum+arr[i];
}
 System.out.println("sum of array elements:"+sum);
}
}

