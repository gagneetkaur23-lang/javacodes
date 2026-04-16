import java.util.Arrays;

class arrayinitialisation {
    public static void main(String []args) {
    int []arr=new int[3];
   //array initialization
   //  2nd method int arr [] = {10,20,30};
    arr[0]=9;
    arr[1]=78;
     arr[2]=56;
//array traverse means print
//for(int i=0;i<arr.length;i++){
   // System.out.println(arr[i]);
   Arrays.sort(arr);
   System.out.println(arr[arr.length-2]);
}

}

