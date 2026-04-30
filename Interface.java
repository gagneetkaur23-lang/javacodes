interface engine{
    void start();
}
interface brake{
    void applyBrake();
}

class bike implements engine,brake{
    public void start(){
        System.out.println("bike engine started");
    }
    public void applyBrake(){
        System.out.println ("brake applied");
    }
}
public class Interface{
    public static void main(String[] args){
bike obj = new bike();
obj.start();
obj.applyBrake();
    }
}














