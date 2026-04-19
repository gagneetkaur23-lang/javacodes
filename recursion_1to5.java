public class recursion_1to5 {
    static void printNumbers(int n){
if (n==6){
    return ;
}
else{
    System.out.println(n);
    printNumbers(n+1);
}
    }
    public static void main(String[] args) {
        recursion_1to5 obj=new recursion_1to5();
        obj.printNumbers(1);
    }
}
