

public class Salary extends Employee { // Inheritance
    
    private double salary;

    public Salary(String name,String address,int number,double salary){
        super(name, address, number);  // overriding 
        setSalary(salary);
    }

    public void setSalary(double newSalary){
        salary = newSalary;
    }

    public void mailCheck(){
        System.out.println("Mail check of salary class.");
        System.out.println("Mailing check to "+getName()+" with salary "+salary); // plymorpism - getName()
    }

    public double getSalary(){       
        return salary;
     }

     public double computePuy(){
         System.out.println("Computing salary pay for "+getName());
         return salary/52;
     }
     
}
