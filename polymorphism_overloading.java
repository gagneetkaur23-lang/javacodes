class add{
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println(a+b);
    }
    public void sum(float a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        add a= new add();
        a.sum(1,2);
        a.sum(1,2,4);
        a.sum(1.6f,5);
    }
}
