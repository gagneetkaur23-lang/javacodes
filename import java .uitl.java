import java .util.*;
 class array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       System.out.println("enter n");
        int n =sc.nextInt();
        System.out.println("enter array elemts");
        int arr[]=new int[n];

         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }

        int max= arr[0];
        for(int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            
        }
         System.out.println("max element is"+" "+max);
            int min=arr[0];
            for(int i=0;i<n;i++){
            if (min>arr[i]){
                min=arr[i];
            }
            

        }
System.out.println("min element is"+" "+min);
    }
    }

