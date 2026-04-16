import java.io.*;
import java.util.Scanner;

 class numbers{
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n=sc.nextInt();
int fac=1;
       for(int i=1;i<=n;i++){
        fac=fac*i;
       }
        System.out.println("factorial of a number"+n+"is:"+fac);
        
        sc.close();
    }
}
 
