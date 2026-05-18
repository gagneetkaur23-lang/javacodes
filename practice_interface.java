interface camera {
    void capture1();
}
interface video{
    void capture2();
}

class mobile implements camera,video{
  public  void capture1(){
System.out.println("abc");
    }
    public  void capture2(){
System.out.println("def");
    }
}
public class practice_interface{
public static void main(String[] args) {
    mobile obj= new mobile();
    obj.capture1();
    obj.capture2();
}
}