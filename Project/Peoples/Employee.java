public class Employee extends People implements Information {

    private String position;
    private int salary;
    static int numberOfEmployees=0;
    private double raise;

    Employee(String name,String lastName,int age,String position){
        super(name,lastName,age);
        this.position = position;
        numberOfEmployees++;
    }

    // @Override
    // public void setSalary(int newSalary){
    //     this.salary = newSalary;
    // }

    // @Override
    // public int getSalary(){
    //     return this.salary;
    // }

        // public double setRaise(double newRaise){
        //     this.raise = newRaise;
        // }


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

    // @Override
    // public double getRaise(){
    //     return this.salary * this.raise;
    // }

    @Override
    public void getInfo(){
        System.out.println("Name: " +getName()+"\n"+"Last Name: "+getLastName()+"\n"+"Age: "+getAge()+"\n"+"Email: "+getEmail()+"\n"+"Job position: "+this.position);
    }
    
}
