interface printer{
    void printing();
    }

    interface scanner{
       public void scanning();
    }

    interface fax{
       public void faxing();
    }

     class all_in_one implements printer,scanner,fax{
       public void printing(){
            System.out.println("printer hepls in printing");
        }
        public void scanning(){
            System.out.println("scanner hepls in scanner");
        }
        public void faxing(){
            System.out.println("fax helps in faxing");
        }
    }
    public class interface_code{
        public static void main(String[] args) {
            all_in_one obj= new all_in_one();
            obj.printing();
            obj.scanning();
            obj.faxing();
        }
    }