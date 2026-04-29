abstract class vehicle{
    abstract void engine();                          //abstract method()
abstract void wheel();
    void fuel(){                                   //normal method()
        System.out.println("all vehicles uses fuel");
    }
}

class Car extends vehicle{
    void engine(){
        System.out.println("car has 4 wheels");
 }
}
class Bike extends vehicle{
    void wheel(){
        System.out.println("bike has 2 wheels");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Car obj= new Car();
        obj.engine();
        Bike boj= new  Bike();
        boj.wheel();
    }
}