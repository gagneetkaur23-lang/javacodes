

interface camera {
    void capture1();
}

interface video{
 void capture2();
}
class mobile implements camera,video{
     public void capture1(){
        System.out.println("camera can capture unforgettable moments ");
    }
     public void capture2(){
        System.out.println("video shoot becomes trending");
    }
}

public class intterfaces_camera{
    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.capture1();
    }
}