   class vehicle  {
    public void run(){
System.out.println("vehicle can run");
    }
}

class car extends vehicle {
public void fuel(){
    System.out.println("car uses fuel");
}
}
    
 class electricCar extends car{
public void battery(){
    System.out.println("electric car uses battery");
}
}
public class inheritance{
public static void main(String[] args){
   electricCar obj = new electricCar();
obj.run();
obj.fuel();
obj.battery();
}
}