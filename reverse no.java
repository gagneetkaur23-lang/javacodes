import java.io.*;
import java.util.Scanner;

 class numbers{
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n=sc.nextInt();
int rev=0;
       while(n!=0){
        int remainder =n%10;
        rev=rev*10+remainder;
        n=n/10;
       }
        System.out.println("reversed  number"+rev);
        
        sc.close();
    }
}
 
