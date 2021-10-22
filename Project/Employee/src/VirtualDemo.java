

public class VirtualDemo  {
    public static void main(String[] args){

        Salary s = new Salary("John Mockey","Janka Cmelika",57,3600.00);
        Employee e = new Salary("Mary Melly","Boska Buha",1,2400.00); //Employee reference to Salary class !!!

        System.out.println("Call mailcheck with Salary reference ");
        s.mailCheck();

        System.out.println("Call mailcheck with Employee reference ");
        e.mailCheck();

    }
}
