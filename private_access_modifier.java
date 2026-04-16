 class private_access_modifier {
    int marks=90;
    private void display(){
        System.out.println(marks);                            //    private access modifier use
    }                                                          //same class
public static void main(String[] args) {                       //no same package
    private_access_modifier obj=new private_access_modifier();     //no sub class 
    obj.display();                                                 //no anywhere
}
}

//class private_access_modifier2 {
 //   int marks=90;
   // private void d(){
      //  System.out.println(marks);                            error because private is not use in another class
   // }  
//}             
  //  class two{                                     
//public static void main(String[] args) {                     
  //  private_access_modifier2 obj=new private_access_modifier2();     
   // obj.d();                                                
//}
//}
