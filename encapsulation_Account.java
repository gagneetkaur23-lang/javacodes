import java.util.*;

public class encapsulation_Account {
    private int balance;

   public void  set_balance(int balance){
 this.balance= balance;
   }
public int get_balance(){
    return balance;

}
 }

 class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Balance");
        int balance = sc.nextInt();
        encapsulation_Account a=new encapsulation_Account();
        a.set_balance(balance);
        System.out.println(a.get_balance());
    }
 }
