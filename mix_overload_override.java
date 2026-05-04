class calculator{
   public void add(int a,int b){
System.out.println(a+b);
   }
public void add (int a,int b,int c){
    System.out.println(a+b+c);
}
public void add(double a,double b ){
    System.out.println(a+b);
}
}
class advance_calculator extends calculator{
    public void add(float a,float b){
        System.out.println(a+b);
    }
    public void add(int a,float b){
        System.out.println(a+b);
    }
}

public class mix_overload_override {
    public static void main(String[] args) {
        advance_calculator obj= new advance_calculator();
        obj.add(1,2);
         obj.add(1,2,3);
          obj.add(123456,267896);
           obj.add(1.2,2.8);
            obj.add(1,2.8);
    }
}
