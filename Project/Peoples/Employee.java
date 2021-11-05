public class Employee extends People implements Information,payment {

    private String position;
    private int salary;
    static int numberOfEmployees=0;
    private double raise;

    Employee(String name,String lastName,int age,String position){
        super(name,lastName,age);
        this.position = position;
        numberOfEmployees++;
    }

    public String getPosition(){
        return this.position;
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
        System.out.println("Name: " +getName()+"\n"+"Last Name: "+getLastName()+"\n"+"Age: "+getAge()+"\n"+"Email: "+getEmail()+"\n"+"Job position: "+this.position);
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
