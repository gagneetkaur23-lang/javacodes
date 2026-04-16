import java.util.*;

public class function_mul_div_diff {
    public static int calculate_diff(int a,int b){      //difference method declare
        return a-b;
    }
    
    public static int calculate_mul(int a,int b){       //multiply method declare
        return a*b;
    }
    public static int calculate_div(int a,int b){         //division method declar
         return a/b;
    }
    
    public static void main(String[]args){         //main method
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();     //input a
        int b = sc.nextInt();    //input b

        int subtraction= calculate_diff(a,b);    // difference call
        System.out.println(subtraction);

       // int multiply= calculate_mul(a,b);        //mul call
        System.out.println("multiply " +calculate_mul(a,b));

        int division= calculate_div(a,b);     // div call
        System.out.println(division);

        
    }
}
