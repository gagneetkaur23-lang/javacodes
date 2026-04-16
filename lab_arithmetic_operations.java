import java.io.*;
import java.util.Scanner;
public class lab_arithmetic_operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();

        int sum= a+b;
        System.out.println("sum of a and b "+ sum);

        int diff=b-a;
        System.out.println("difference of a and b "+ diff);

        int mul=a*b;
        System.out.println("multiplication of a and b "+ mul);

        int div=a/b;
        System.out.println("division of a and b "+div);

    }
}
