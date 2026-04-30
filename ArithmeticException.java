public class ArithmeticException {
    public static void main(String[] args) {
        int a=12;
        int b = 0;
        try{
        int result =a/b;
        System.out.println(result);                 //arithmetic exception error 
    }
        catch (Exception e){
System.out.println("handle error dividing by zero");
        }
System.out.println("the end of program");
        
    }
}
