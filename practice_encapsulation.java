 class account  {
    private int balance;

    public void setbalance(int balance){
        this.balance= balance;
    }

    public int get_balance(){
        return balance;
    }

    public static void main(String[] args) {
        account obj= new account();
        obj.setbalance(1000);
        System.out.println(obj.get_balance());
    }
}
