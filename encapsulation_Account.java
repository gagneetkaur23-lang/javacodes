import java.util.*;

public class encapsulation_Account {               
    private int balance;                     //declare balance as private

   public void  set_balance(int balance){
 this.balance= balance;                        //store private balance to public balance 
   }
public int get_balance(){
    return balance;                             //retur balance 

}
 }

 class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Balance");
        int balance = sc.nextInt();                      //tale input of balance 
        encapsulation_Account a=new encapsulation_Account();
        a.set_balance(balance);                                   //pass in set function 
        System.out.println(a.get_balance());                      //display balance by getter method
    }
 }
