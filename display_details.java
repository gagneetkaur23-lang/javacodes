import java.io.*;
import java.util.Scanner;

public class display_details {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
    
    String data_members =obj.nextLine();
    String name=obj.nextLine();
    float marks= obj.nextFloat();

    System.out.println(data_members);
    System.out.println(name);
    System.out.println(marks);
    
}
}
