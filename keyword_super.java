 class transport {
    int speed = 100;
}
class bus extends transport{
    int speed =120;
    void display(){
        System.out.println(super.speed);
    }
}
public class keyword_super{
    public static void main(String[] args) {
        bus b = new bus();
        b.display();
    }
}