import java.util.*;

 class add_two_matrices { 
     public static void main(String[]args){
Scanner sc= new Scanner(System.in);

System.out.println("enter the number of rows");    //input rows
int rows= sc.nextInt();

System.out.println("enter the number of columns");     // input columns
int columns= sc.nextInt();

int a[][]= new int[rows][columns];    //declare 1st matric
int b[][]= new int[rows][columns];    // declare 2nd array
int sum[][]=new int[rows][columns];

for (int i=0;i<rows;i++){
    for (int j=0;j<columns;j++){             // input 2d array elements of 1st matric
        System.out.println("enter the elements of 1st array");
         a[i][j]=sc.nextInt();
    }
}

    
    for (int i=0;i<rows;i++){
    for (int j=0;j<columns;j++){            // input 2d array elements of 2nd matric
        System.out.println("enter the elements of 2nd array");
         b[i][j]=sc.nextInt();
    }
}

for (int i=0;i<rows;i++){
    for (int j=0;j<columns;j++){            // sum of two matrices
        sum[i][j]=a[i][j]+b[i][j];
         
    }

    }
    
    System.out.println("sum of two matrices");
    for (int i=0;i<rows;i++){
    for (int j=0;j<columns;j++){            // print sum
        System.out.print(sum[i][j]+" ");
         
    }
System.out.println();
    }
    
     }
 }

