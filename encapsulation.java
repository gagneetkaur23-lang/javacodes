public class encapsulation {
    private int name;

    public void setName(int x){             //setter method
name=x;                                     //getter method
    }
    public int getName(){
    return name;
    }
}

 class Main{
    public static void main(String[] args){
        encapsulation obj=new encapsulation();
       obj.setName(88);
       System.out.println(obj.getName());
    }
}