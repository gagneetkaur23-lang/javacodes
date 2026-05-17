abstract class employee {
    String name;
    int ID;
    abstract void calculate_salary();
    void display_details(){
        System.out.println(name);
        System.out.println(ID);
    }

}

class fullTime_employee{
float monthly_salary=34000;
void calculate_salary(){
    System.out.println("Monthly salary is "+" "+monthly_salary);
}
}
class partTime_employee{
void partTime_salary(){
int part_time_salary=21000;
System.out.println("Part-Time salary is "+" "+part_time_salary);
}
public class abstraction_employee{
    public static void main(String[] args) {
        fullTime_employee obj= new fullTime_employee();
        obj.calculate_salary();

        partTime_employee abc= new partTime_employee();
        abc.partTime_salary();

       String name ="gagneet";
       System.out.println("Name of Employee is"+" "+name);
       int ID= 101;
 System.out.println("ID of employee is "+" "+ID);

    }
}
}