import java.io.*;
import java.util.Scanner;
class conversion{
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
System.out.println("enter a inch");
Double inch =sc.nextDouble();
double meters = inch*0.0254;
System.out.println("meters:"+meters);
    }
}
