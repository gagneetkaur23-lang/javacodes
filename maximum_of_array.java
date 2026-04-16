import java.util.*;
class maximum_of_array{
    public static void main(String[] args){
  Scanner sc= new Scanner(System.in);

  System.out.println("enter size ");       //input size
  int size = sc.nextInt();

int marks[]= new int[4];      //array declare

for (int i=0;i<marks.length;i++){          //array input
    System.out.println("enter array elements");
    marks[i]= sc.nextInt();
}
int maximum= marks[0];           //max=marks[0]
for (int i=0;i<marks.length;i++){
if(marks[i]>maximum){
    maximum=marks[i];
}
}
System.out.println( "maximum marks is:"+maximum);

}
    }

