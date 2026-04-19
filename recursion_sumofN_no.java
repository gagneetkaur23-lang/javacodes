public class recursion_sumofN_no {
    static void sum(int n,int i,int sum){
    if(i==n){
        sum=sum+i;
        System.out.println(sum);
        return;
    }
    
        sum= sum+i;
    sum(n,i+1,sum);
        
    }
    public static void main(String[] args) {
        recursion_sumofN_no obj= new recursion_sumofN_no();
        obj.sum(5,1,0);
    }
}
