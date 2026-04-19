public class recursion_5to1 {
static void printNumbers(int n){
    if(n==0){
        return;
    }
    else{
        System.out.println(n);
        printNumbers(n-1);
    }
}

    public static void main(String[] args){
        recursion_5to1 a=new recursion_5to1();
        a.printNumbers(5);
    }
}
