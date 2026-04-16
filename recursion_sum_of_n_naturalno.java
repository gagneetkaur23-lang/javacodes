import java.io.*;
import java.util.Scanner;

public class recursion_sum_of_n_naturalno {
    public static void CalculateSum(int i ,int n,int sum){
        if (i==n){
            sum+=i;
              System.out.println(sum);
            return;
        }
    
            sum+=i;
            CalculateSum(i+1, n, sum);
    }

    public static void main(String[] args){
        CalculateSum(1,5,0);
    }
}
