public class Teacher extends People implements Information,payment {

    private int salary;
    private String teacherOfWhat;
    static int numberOfTeachers=0;
    public String[] arrOfStudents = new String[Student.numberOfStudents]; //length->static variable from Students
    private double raise;

    Teacher(String name,String lastName,int age,String teacherOfWhat){
        super(name,lastName,age);
        this.teacherOfWhat = teacherOfWhat;
        numberOfTeachers++;
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
                // inteface
    @Override
    public void getInfo(){
        System.out.println("Name: " +getName()+"\n"+"Last Name: "+getLastName()+"\n"+"Age: "+getAge()+"\n"+"Email: "+getEmail()+"\n"+"Teacher of : "+this.teacherOfWhat);
    }
            // interface
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
