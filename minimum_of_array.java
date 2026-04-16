import java.util.*;
class minimum_of_array{
    public static void main(String[] args){
  Scanner sc= new Scanner(System.in);

  System.out.println("enter size ");       //input size
  int size = sc.nextInt();

int marks[]= new int[size];      //array declare

for (int i=0;i<marks.length;i++){          //array input
    System.out.println("enter array elements");
    marks[i]= sc.nextInt();
}
int minimum= marks[0];           //min=marks[0]
for (int i=0;i<marks.length;i++){
if(marks[i]<minimum){
    minimum=marks[i];
}
}
System.out.println( "minimum marks is:"+minimum);

}
    }

