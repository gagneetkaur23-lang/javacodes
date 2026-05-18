class calculator{
     void add(int a,int b){
        System.out.println(a+b);
    }
     void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
     void add(double a,double b){
        System.out.println(a+b);
    }
}

class advance_calculator extends calculator{
void add(float a,int b){
    System.out.println(a+b);
}
void add(float a,float b){
    System.out.println(a+b);
}
}

public class practice_calculator {
    public static void main(String[] args) {
        
    
    advance_calculator obj = new advance_calculator();
    obj.add(1,2);
    obj.add(1,2,3);
    obj.add(12.67890,13.45678);
    obj.add(12.4,2);
    obj.add(12.4,89.6);
    }
}
