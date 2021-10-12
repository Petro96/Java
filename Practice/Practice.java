public class Practice{

    String name,program; //Declaration
    int age;
    double score;
    int howManyStudents=0;

    // Practice(){ //Initialization
    //     System.out.println("Hello,Im Student.");
    // }

    Practice(String name,int age,String program,double score){
        //this(); // only can be use in constructor
        this.name = name;
        this.age = age;
        this.program = program;
        this.score = score;
        
    }

    public void printingInfo(){
        
        System.out.print("Name: "+this.name+"\nAge: "+this.age+"\nProgram: "+this.program+"\nScore: "+this.score);
    }

    public void dorm(){
        if(this.age > 27){
            System.out.println("Student can not have dorm.");
        }
        else{
            System.out.println("Student can have a dorm.");
        }
    }

    public void schoolarship(){
        if(this.score >= 8.50){
            System.out.println("\nStuden "+this.name+" has Schoolraship.");
        }
        else{
            System.out.println("Student dont have Shoolarship.");
        }
    }
    
    public double highScore(Practice[] arr){
        int l = arr.length;
        double m =0;

        for(int i=0;i<l;i++){
            if(arr[i].score > m){
                m = arr[i].score; // without this (arr[i])
            }
        }
        return m;
    }

    public void printStudents(Practice[] a){
        
        for(int i=0;i<a.length;i++){
            a[i].printingInfo();
            a[i].schoolarship();
            a[i].dorm();
            System.out.println("\n");
        }
    }

    // PASSING ARRAY OF CLASS //////////////////////////////////////////////////////////////////////////

    // -> define array of class => create new object which you use for passing array of class !!!!!! 

    /*
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");

        Main p1 = new Main("Valdo");
        Main p2 = new Main("Janko");

        Main[] array = new Main[2]; // array of class Main() // Main[] array={p1,p2}
        
        array[0] = new Main("Vlado"); // p1
        array[1] = new Main("Janko"); // p2
        
        Main m = new Main("Array of Class."); // object for passing array of class
        m.printNames(array);
        */

    public static void main(String args[]){

        //Practice s1 = new Practice("John",21,"IT",8.50); //instantiation
        //Practice s2 = new Practice("Leo",23,"IT",9.00);

        Practice[] array = new Practice[3]; //create array of objects
        array[0] = new Practice("John",21,"IT",8.50);
        array[1] = new Practice("Leo",23,"IT",9.00);
        array[2] = new Practice("Mary",24,"Web Development",9.50);

        // Passing array of class

        Practice p = new Practice("name",21,"program",45.6);
        System.out.println("Students highes score :"+p.highScore(array));

        // array[0].printingInfo();   
        // array[0].schoolarship();
        // array[0].dorm();
        System.out.println("The List of Students:");
        Practice s = new Practice("name",23,"student_prog",56.7);
        s.printStudents(array);
        
        
    }

    //Shop
    // Shop : name,item
    // how_many_items
    // print_list_of_items


    // Hero
    // hero --> name,healt
    //hero can be defeted(if (-) return to 0)
    //hero can be heal 

    //Employee
    // Employee id,first,last,salary,email
    //get_full_name
    //rise
    //is_getting_to_course

    //Restaurant
    //Reservation(count,capacity,open)
    //confirmReseravation --> restauranCapasity ,guestCount => if confirmed makeListOfFood()
    //InformUser -- > is reservatio denied contact restaurant,else:enjoy your meal

}