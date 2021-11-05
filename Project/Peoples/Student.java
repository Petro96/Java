public class Student extends People implements Information,Dorm {

    private String faculty;
    private String email;
    private double score;
    static int numberOfStudents=0;
    private int scholarship_payment;

    Student(String name,String lastName,int age,String faculty,double score){
        super(name,lastName,age);
        this.faculty = faculty;
        this.score = score;
        numberOfStudents++;

        if(scholarship()){
            this.scholarship_payment = 800;
            
            }

        
        else{
            this.scholarship_payment = 0;
        }
        
    }   


    public double getScore(){
        return this.score;
    }
    
    public String getFaculty(){
        return faculty;
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
        System.out.println("Name: " +getName()+"\n"+"Last Name: "+getLastName()+"\n"+"Age: "+getAge()+"\n"+"Email: "+getEmail()+"\n"+"His faculty: "+this.faculty+"\n");
    }

    

    @Override
    public boolean scholarship(){
        if(getScore() > 9.00){
            return true;
        }
        else{
            return false;
        }
    }

    
    // @Override
    // public void setScholarship(int newScholarship_payment){
    //     his.scholarship_payment = newScholarship_payment;
    //     }
    


    @Override
    public int getScholarship(){
        return this.scholarship_payment;
    }

    @Override
    public void dorm(){
        if(getScore() >= 8.00){
            System.out.println(getName()+" has a dorm for free.");
        }
        else if(getScore() > 7.00 && getScore() < 8.00){
            System.out.println(getName()+" has dorm but is not free.");
        }
        else{
            System.out.println(getName()+" doesn have dorm.");
        }
    }

}
