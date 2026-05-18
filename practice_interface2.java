interface printer{
    void printing();
}
interface scanner{
    void scanning();
}
interface fax{
    void faxing();
}

class all_in_one implements printer,scanner,fax{
     public void printing(){
        System.out.println("printing......");
}
 public void scanning(){
    System.out.println("scanning......");
 }
  public void faxing(){
    System.out.println("faxing......");
  }
}

public class practice_interface2 {
    public static void main(String[] args) {
        all_in_one obj = new all_in_one();
        obj.printing();
        obj.scanning();
        obj.faxing();
    }
}
