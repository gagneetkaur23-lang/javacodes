import java.util.*;

public class function_add {
    public static int add(int a,int b){     //function declare
        int sum=a+b;                        //function define
        return sum;
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();           //input a 
        int b = sc.nextInt();           //input b 

        int sum = add(a,b);                //call function 
System.out.println(sum);
    }
}

