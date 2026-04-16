 import java.io.*;
 class transport {
    void move(){
        System.out.println("transport can move");
    }
    void fuel(){
        System.out.println("transport uses fuel");
    }
 }
    class bus extends transport{
        void move(){
            System.out.println("bus is move on road");
        }
        void fuel(){
            System.out.println("bus uses fuel");
        }
    }

    class train extends transport{
void move(){
    System.out.println("train runs n track");
}
void fuel(){
    System.out.println("train uses electricity");
}
    }

    class aeroplane extends transport{
        void move(){
            System.out.println("aeroplane flying in the sky");
        }
        void fuel(){
           System.out.println("aeroplane uses aviation fuel");
        }
    

    public static void main(String[] args){
       transport t=new train();
        
transport b=new bus();
transport a=new aeroplane();
a.fuel();
a.move();
b.fuel();
b.move();
t.fuel();
t.move();
    }
}