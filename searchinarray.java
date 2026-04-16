import java.util.*;
public class searchinarray {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int arr[] ={10,9,8};
System.out.println("enter x");
   int x = sc.nextInt();

    for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        System.out.println("array index :"+i);
    }
}
}
}
