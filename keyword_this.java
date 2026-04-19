public class keyword_this {
    int age ;
    String name;
    void abc(int age,String name){
        this.age=age;
        this.name=name;
    }
        void display(){
            System.out.println(name+" "+"of age"+" " +age  );
        }

        public static void main(String[] args) {
            keyword_this a=new keyword_this();
            a.abc(23,"gagneet");
            a.display();
        }
    }

