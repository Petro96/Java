public class Main{
    public static void main(String[] args){

        System.out.println("Hello");

        Employee e1 = new Employee(1234,"Mark","Johnson",12000);
        System.out.println(e1.toString());

        Employee e2 = new Employee(4567,"Michael","Simpson",20000);
        System.out.println(e2.toString());

    }
}