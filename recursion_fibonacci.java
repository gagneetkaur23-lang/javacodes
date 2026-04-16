import java.util.*;
import java.io.*;
public class recursion_fibonacci {
    public static void series(int n ,int a,int b){
        if(n==0){
            return ;
        }

        int c =a+b;
        System.out.print(c+" ");
        series(n-1,b,c);
    }
    
    public static void main(String[] args){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        int n = 10;
        series(n-2,0,1);
    }
}
