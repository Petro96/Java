package Employee;
import java.io.*;

public class Employee_test{

    public static void main(String args[]){

        Employee empOne = new Employee("Jack");
        Employee empTwo = new Employee("Micky");

        empOne.setAge(24);
        empOne.setDesignation("Software Developer");
        empOne.setSalary(700);
        empOne.print_Employee();
        System.out.println("---------------------------------");
        empTwo.setAge(30);
        empTwo.setDesignation("Web Developer");
        empTwo.setSalary(1500);
        empTwo.print_Employee();
    }
}