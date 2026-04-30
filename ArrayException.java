public class ArrayException {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
    

        //        System.out.println(arr[4]);           array index of bound exception error
       try{                                             //find exception
        System.out.println(arr[4]);
    }
    catch(Exception e){
        System.out.println("Array Index of bound exception ");          //handle the exception
    }
    System.out.println("end of the program");
}
}
