import java.io.*;
import java.util.Scanner;

public class sum_natural_no{
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n=sc.nextInt();
int sum =0;
       for(int i=1;i<=n;i++){
         sum = sum+i;
            System.out.println("sum of n natural numbers:"+ sum);
        }
        sc.close();
    }
}
 
