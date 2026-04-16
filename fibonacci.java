import java.io.*;
import java.util.*;

 public class fibonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
System.out.println("enter the value of n");
int n = sc.nextInt();
int a=0,b=1;
System.err.print(a+" "+b+" ");
for (int i=3 ;i<=n;i++){
    int nextNo=a+b;
    System.out.print(nextNo+" ");
    a=b;
    b=nextNo;
}
    }
    
}
