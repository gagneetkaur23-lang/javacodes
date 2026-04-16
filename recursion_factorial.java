import java.io.*;

public class recursion_factorial {
    public static void factorial(int i,int n ,int fac){
        if (i==n){
            fac=fac*i;
            System.out.println(fac);
            return;

        }

     fac= fac*i;
     factorial(i+1,n,fac);
    }

    public static void main(String[] args){
        factorial(1,3,1);
    }
    








}
