abstract class vehicle{
    abstract void wheels();                          //abstract method()
abstract void wheel();
    void fuel(){                                   //normal method()
        System.out.println("all vehicles uses fuel");
    }
}

class car extends vehicle{
    void wheels(){
        System.out.println("car has 4 wheels");
 }
}
class bike extends vehicle{
    void wheel(){
        System.out.println("bike has 2 wheels");
    }
}

public class abstraction{
    public static void main(String[] args) {
        car obj= new car();
        obj.wheels();
        bike boj= new  bike();
        boj.wheel();
    }
}