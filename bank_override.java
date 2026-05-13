 class bank{
    public void interest_rate(){
        System.out.println("bank interest");
    }
}
class sbi extends bank{
public void interest_rate(){
        System.out.println("sbi interest rate is 10%");
    }
}
class hdfc extends bank{
public void interest_rate(){
        System.out.println("HDFC interest rate is 12%");
    }
}
class icici extends bank{
public void interest_rate(){
        System.out.println("icici interest rate is 14%");
    }
}

public class bank_override{
    public static void main(String[] args) {
        bank s = new sbi();
        bank h= new hdfc();
        bank i= new icici();
        s.interest_rate();
         h.interest_rate();
          i.interest_rate();
    }
}