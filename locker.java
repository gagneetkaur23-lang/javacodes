public class locker {
    private int pin=1234;
    private boolean isopen=false;

    public void openLocker(int enterPin){
        if(enterPin==pin){
            isopen=true;
            
            System.out.println("locker is opened");}
            else{
                System.out.println("wrong pin");
            }
        }
            public void checkStatus(){
                if (isopen) {
                    System.out.println("locker is opened");
                }
                else{
                    System.out.println("locker is closed");
                }
            }
        }
            class Main{
                public static void main(String[] args){
locker l= new locker();
l.checkStatus();
l.openLocker(1234);
    l.checkStatus();
;
                }
            }
        
    

