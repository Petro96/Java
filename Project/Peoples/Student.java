public class Student extends People implements Information {

    private String faculty;
    private String email;
    private double score;
    static int numberOfStudents=0;

    Student(String name,String lastName,int age,String faculty){
        super(name,lastName,age);
        this.faculty = faculty;
        numberOfStudents++;
        
    }   

    public void setScore(double score){
        this.score = score;
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

    //public schoolarship();
    //public dorm(); 

}
