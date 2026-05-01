public class FinallyException {
    public static void main(String[] args){
        try{
int a =13;
int b =0;
     int result=a/b;
    System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Arithmetic Exception caught");
        }

        try{
    int arr[]={10,20,30,40};
    System.out.println(arr[4]);
        }
        catch(Exception e){
System.out.println("Array index Exception caught");
        }

        finally{
            System.out.println("program finished");
        }
}
    }


