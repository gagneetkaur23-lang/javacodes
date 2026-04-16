 class default_access_modifier {
    int marks= 90;
    default void A(){
        System.out.println(marks);                                   //default access modifier use in 
    }                                                                 //same class
                                                                       //same package
    public static void main(String[] args) {                           //no sub class
        default_access_modifier obj=new default_access_modifier();      //no everywhere
        obj.display();
    }
}
