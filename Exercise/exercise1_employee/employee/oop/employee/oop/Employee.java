
public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public int salary;


    public Employee(int id,String firstName,String lastName,int salary){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    protected int getID(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    protected String getLastName(){
        return this.lastName;
    }

    protected int getSalary(){
        return this.salary;
    }

    public int setSalary(int newSalary){
        this.salary = newSalary;
        return this.salary;
    }

    protected int getAnnulaSalary(){
        return this.salary*12;
    }

    public double raiseSalary(double percent){
        return this.salary*percent;
    }

    public String toString(){
        return "Employee id: "+this.id+" firstName: "+this.firstName+" lastName: "+this.lastName+" salary: "+this.salary+".";
        
    }


}
