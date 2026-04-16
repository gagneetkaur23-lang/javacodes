import java.util.*;

 class two_d_array { 
     public static void main(String[]args){
Scanner sc= new Scanner(System.in);

System.out.println("enter the number of rows");    //input rows
int rows= sc.nextInt();

System.out.println("enter the number of columns");     // input columns
int columns= sc.nextInt();

int arr[][]= new int[rows][columns];    //declare 2d array

for (int i=0;i<rows;i++){
    for (int j=0;j<columns;j++){             // input 2d array elements 
        System.out.println("enter the elements of array");
         arr[i][j]=sc.nextInt();
    }
}

    for (int i=0;i<rows;i++){
    for (int j=0;j<columns;j++){             // input 2d array elements 
        System.out.print(arr[i][j]+" ");
         
    }
    System.out.println();
}


    }
    
     }
    
