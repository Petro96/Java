public class Manager extends People implements Information,payment{

    private String[] arrOfEmployees = new String[Employee.numberOfEmployees];
    private int salary;
    private double raise;
    static int numberOfManagers;

    public Manager(String name,String lastName,int age,String[] arr){

        super(name,lastName,age);
        this.arrOfEmployees = arr;
    }

    public String[] getArray(){
        return this.arrOfEmployees;
    }

    public String getEmail(){
        return super.getEmail(); // this.email in people classs -- > return email from own class
        }

    public String getName(){
        return super.getName();
        }

    public String getLastName(){
        return super.getLastName();
    }

    public int getAge(){
        return super.getAge();
    }


    @Override
    public void getInfo(){
        System.out.println("Name: " +getName()+"\n"+"Last Name: "+getLastName()+"\n"+"Age: "+getAge()+"\n");
    }

    @Override
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    @Override
    public int getSalary(){
        return this.salary;
    }
    
    @Override
    public void setRaise(double newRaise){
        this.raise = newRaise;
    }

    @Override
    public double getRaise(){
        return this.raise;
    }

    @Override
    public double afterRaise(){
        return this.salary * this.raise;
    }
}
