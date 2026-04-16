import java.io.*;
import java.util.Scanner;

public class String_concat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S1="hello";
        String S2="World";

        String result=S1+" "+S2;      //using operator to concat
        System.out .println(result);  
       // System.out .println(S1+S2);   //second method

        String j1="gagneet";
        String j2="kaur";

String fullname= j1.concat(" ").concat(j2);
System.out .println(fullname);                        //using concat method
//System.out.println(j1.concat (" ").concat(j2));     //second method
    }
}

