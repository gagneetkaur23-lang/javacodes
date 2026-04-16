import java.io.*;
import java.util.Scanner;

public class arrayinputuser{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a size of array");
        int size= sc.nextInt();   //size input

    int []arr=new int[size];     // array declare
   //array input from user
   for(int i=0;i<arr.length;i++){
    System.out.println("enter array elements");
    arr[i]= sc.nextInt();
}
    
//array traverse means print
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}

}
}
