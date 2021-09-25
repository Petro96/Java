package Employee;

public class Employee{
    String name;
    int age;
    String Designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public void setAge(int emp_age){
        age = emp_age;
    }

    public void setDesignation(String emp_designation){
        Designation = emp_designation;
    }

    public void setSalary(double emp_salary){
        salary = emp_salary;
    }

    public void print_Employee(){
        System.out.println("Empolyee name: "+name);
        System.out.println("Employee age: "+age);
        System.out.println("Employee Designation: "+Designation);
        System.out.println("Employee salary: "+salary);
    }
}