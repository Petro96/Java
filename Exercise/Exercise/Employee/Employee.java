public class Employee{

    int id;
    String firstName;
    String lastName;
    int salary;

    int counter = 0;


    public Employee(int id,String firstName,String lastName,int salary){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

        this.counter +=1;
    }

    protected int getID(){
        return this.id;
    }

    protected String getFirstName(){
        return this.firstName;
    }

    protected String getLastName(){
        return this.lastName;
    }

    protected int getSalary(){
        return this.salary;
    }

    protected String getName(){
        return this.firstName + this.lastName;
    }

    protected int getAnnualSalary(){
        return this.salary*12;
    }

    public int raiseSalary(int percent){
        return this.salary*percent;
    }

    public String toString(){
        return "Name: "+this.firstName +" "+ this.lastName+", salary: "+this.salary;
    }
}