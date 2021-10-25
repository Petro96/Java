public class Main{

    public static void main(String[] args){

        //People p1 = new People("Janko","Petras",23); // its abstract class, can not create objects!!!!! 
        //System.out.println(p1.getEmail());
        // System.out.println(p1.name="Pavel"); //Its not gonna change email automaticlly
        // System.out.println(p1.getName());
        // System.out.println(p1.getEmail());

        //Students
        Student s1 = new Student("Leo","Monther",23,"FEI STU BA"); //People s1 = new Student(...)

        System.out.println(s1.getName());
        System.out.println(s1.getFaculty());
        System.out.println(s1.getEmail());
        s1.setScore(7.50);
        System.out.println("Score: "+s1.getScore());
        s1.getInfo();
        System.out.println("Number of students "+Student.numberOfStudents); //static variable of People class
        
        //static method() : static variable -->> call class.static_method()
        
        //Teachers
        Teacher t1 = new Teacher("Mary","Johnson",34,"English Language");
        System.out.println("Number of Teachers: "+Teacher.numberOfTeachers);
        t1.getInfo();
        System.out.println("Length of arrayOfStudents:"+t1.arrOfStudents.length);

        //Employee
        Employee e1 = new Employee("Mark","Robbinson",30,"IT Manager");
        System.out.println("Number od employees: "+Employee.numberOfEmployees);
        // e1.setSalary(1000);
        // System.out.println("Raise "+e1.getRaise());
        e1.getInfo();

    }

}