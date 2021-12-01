public class PeopleObjects extends People{

    //array of students 6  // Student[] arrOfStudents = new Student[6]; --> arrOfStudents[0] = new Student(name,lastName,age,faculty,score)
    //array of teachers 3
    //array of employees 6
    //array of managers  2
    
    
    Student[] students = new Student[3]; 
    students[0] = new Student("John","Splithof",23,"IT",80.9);
    students[1] = new Student("Mark","Johnson",26,"Architect",90.9);
    students[2] = new Student("Juli","Simpson",22,"IT",88.9);

    Teacher[] teachers = new Teacher[3];
    teachers[0] = new Teacher("Paul","Johnson",34,"Architect");
    teachers[1] = new Teacher("Marry","Simon",37,"IT");
    teachers[2] = new Teacher("Anna","Mensson",30,"IT");

    Employee[] employees = new Employee[3];
    employees[0] = new Employee("Jack","Simon",34,"Web Developer");
    employees[1] = new Employee("Sanja","Moon",32,"App Developer");
    employees[2] = new Employee("Lucy","Jefferson",35,"Architect"); 


    
    // Manager[] managers = new Manager[3];
    // managers[0] = new Manager("Lucy","Petterson",34); //str array of employee
    // managers[1] = new Manager("Michael","Jackson",37);
    // managers[2] = new Manager("Silvia","Moor",32);

    public PeopleObjects(){

    
    
    }
    

    



    
}
