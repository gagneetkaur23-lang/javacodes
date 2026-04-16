 class public_aces_modfier {
    int marks = 90;
   public  void hello(){
    System.out.println(marks);
   }
}
                                     //public access modifier is use:
   class second{                                         //anywhere
       public static void main(String[] args){            //same class
public_aces_modfier obj=new public_aces_modfier();        //same package
obj.hello();                                              //sub class
    }                                                    //object us class ka bnega jis ko display krwana hai
   }
    
