// -------------------- OOP --------------------------------


//package my_oop_package;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Calculation{ //superclass

    int result;
    int number = 13;
    String name;

    Calculation(String name){
        this.name = name;
    }

    
    public void addition(int a,int b){
        result = a + b;
        System.out.println("Sum of two numbers "+result);
    }

    public void subtraction(int a , int b){
        result = a - b;
        System.out.println("Difference between two numbers: "+result);
    }

    public void display(){
        System.out.println("This is from SuperClass");
    }
}

 interface Prey{                // if i want to have public interface i need to define it in separete file !!!!!
        public void flee();
       
}

 interface Predator{
    public void hunt();

    
}


public class OOP extends Calculation{

    //  ----------------------------------------------- inheritance ------------------------
    // superclass
    // subclass - in which we call superclass

    int number = 23;

    OOP(String name){ //constructor of OOP extends constructor of Calculator
        super(name);
    }


    public void multiplication(int a,int b){
        result = a * b;
        System.out.println("Multiplication of two numbers: "+result);

    }

    public void display(){
        System.out.println("This is from Subclass.");
    }


    public void method(){ // super() method

        OOP sub = new OOP("My calculator Leon");

        sub.display();

        super.display();

        System.out.println("Name of Calculator: "+super.name);

        System.out.println("Variable from superclass: "+super.number);

        System.out.println("Variable from subclass: "+sub.number);
    }
    /*
    public static void main(String[] args){
        int a=4;
        int b=6;

        OOP obj = new OOP("My Calculator Leon");

        //reference to subclass(OOP)

        //Calculation obj = new OOP() ---->>> cant use multiplication method(subclass method) !!!! ;

        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.method();

        // IS-A  (instanceof)
        System.out.println(obj instanceof OOP);
        System.out.println(obj instanceof Calculation); // OOP extends Calculation

        

    }*/
        // --------------------------------------- FINAL ------------------------------------
        // final variable,method,class -> can not override
        // variable: can not override,inheritance,change
        // method : can not overriding
        // class : can not extend
        // ----------------------------------------- PACKAGE ---------------------------------
        // useage : for organize classes and intefaces
        // types: built-in 
        //        user-defined 
        //packages : javac -d(where to put generated class file(javac -d.filename.java->in the same directory)) main.java ---> compile from terminal
        //similar types of classes
        //interfaces
        //packages
        //declar: package pack; calling: import pack.*
        //                               import pack.classname
        //                               fully name : pack.A obj = new pack.A();
        // packages => imports => classes
        // Subpackages defining =>> domain.company.package

        // In Java can not use multiple inheritance: -->> Illigal  class Animal extends Dog,Cat 

    
    // -------------------------------------------- Overriding -----------------------------------
    // override functionality of exsistnig method  (super())
    // take as to the POLYMORPHISM 

    // class that a extends can use for reference : extends Animal --> Dog a = new Animal()
    // class that a extends can use super() method

    /*
    class Animal {
        public void move() {
           System.out.println("Animals can move");
        }
     }
     
     class Dog extends Animal {
        public void move() {
           super.move();   // invokes the super class method on class that extends Animal
           System.out.println("Dogs can walk and run");
        }
     }
     
     public class TestDog {
     
        public static void main(String args[]) {
           Animal b = new Dog();   // Animal reference but Dog object
           b.move();   // runs the method in Dog class
        }
     }
     */

     // Polymorphism 

     //take an object to many more !
     // Deer d = new Deer(); ->>> Animal a = d; refer the same object !! 
     // Virtual Demo -- > reference class(Employee e = new Salary) ==> because Salary extends Employee

     //----------------------------------------------- ArrayList -------------------------------------------------------------
     // ArrayList (custom Type) ,List, LinkedList
     // methods : add(),addAll(),clear(),clone(),get(),indexOf(),remove(),size(),set(index,what to do),sort(),toArray()
     //           toString()
    
     /*
    public static void main(String[] args) {

        ArrayList<String> s1 = new ArrayList<String>();  // ArrayList
        ArrayList<String> s2 = new ArrayList<String>();

        List<Integer> grades = new ArrayList<Integer>(); // List

        List<Integer> numbers = Arrays.asList(3,4,5,6,7); // convert array to list

        System.out.println("Index of 4: "+numbers.indexOf(4));

        System.out.println("Convert list to array and print with toString(): "+Arrays.toString(numbers.toArray()));

        //Nested list
        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
        allGrades.add(Arrays.asList(1,2,3,4));
        allGrades.add(Arrays.asList(5,3,1,10));
        allGrades.add(Arrays.asList(11,22,32,45));

        for(List<Integer> g : allGrades){
            for(int grade : g ){
                System.out.print(grade+" ");
            }
            System.out.println();
        }

        // convert list to array (toArray() --- >> return array of object) or ... 
        int arr[] = new int[numbers.size()];
        
        for(int i=0;i<numbers.size();i++){
            arr[i] = numbers.get(i);          //return array of integers
        }
        System.out.println("Convert List to Array: "+Arrays.toString(arr));


        //working with ... 

        grades.add(5);
        grades.add(4);
        grades.add(1,7);
        if(!grades.isEmpty()){ // isEmpty(),remove(),clear()
            System.out.println("Value "+grades.get(1));
        }
        
        System.out.println("Index "+grades.indexOf(7));
        System.out.println("Does Contain "+grades.contains(7));

        // printing

        s1.add("Lucy");
        s1.add("Silvia");
        s1.add("Maya");

        s2.add("Mark");
        s2.add("John");
        s2.add("Jeffry");
         
     }*/

     // --------------------------------------Inteface -----------------------------------------------------------
     // types: methods, static methods , nested type
     // Interface can extends more interfaces 
     // - solve probelm with Inheritance -> can impleents more than one ...
     // - define methods outide of inteface
     // - if i want to have public inteface needs to be define in separate file !!!!!

     // -------------------------------------Static keyword ------------------------------------------------------------
     // static variable - changes inside class
     // can not iteract with non static 
     // method : static void friends(); className.friends()  like : Math.round(number):
     // A class can be made static only if it is a NESTED class.
     // static block --> static{int num,String name};

     // ------------------------------------------ Abstract Class -------------------------------------------------------
     // process of hiding implementation details from user (what object does instead how it does !!!! ) 
     // abstract class can not be instantiated(created)
     // abstract method,classes are define without body, child class must implement that method !!!
     // Abstract class = abstract method

     // -------------------------------------------- Encapsulation --------------------------------------------------------
     //wrapping the data (variables) and code acting on the data (methods) together as a single unit
     // declaration: private / access : getters,setters
     //benefits : class can be made read-write only 

     //----------Association
     // established relationship between two separated classes through their objects.
     /*
     public static void main(String[]  args){     // example of association 
         OOP obj = new OOP("Mars");
         System.out.println("Association--> number from extends classs "+obj.number);
     }
     */

     //----------Aggregation
     // HAS - A relationship
     // as method argument we use object type !!!
     // one class depend on another : human needs heart and heart needs human body

     // -------------------------------------------------------- 2D Array ------------------------------------------------
     // in 1D array ->> Arrays.toString(array); , in 2D array ->>> Arrays.DeepToString(array);
     /*
    public static void main(String[] args){

        char[][] ticTacToe = {{'X','O','X'},{'X','O',' '},{'X',' ','X'}};
        
        System.out.println("Array "+Arrays.deepToString(ticTacToe)); // deepToString()
        
        for(int i=0;i<ticTacToe.length;i++){
            //System.out.println();
            for(int j=0;j<ticTacToe[i].length;j++){

                System.out.print(ticTacToe[i][j]+" "); // print --> in the same line!

                if(ticTacToe[i][j]=='X'){
                  //System.out.println(ticTacToe[i][j]+"\n");
                    ticTacToe[i][j] = 'O';
                }
                else if(ticTacToe[i][j]=='O'){
                    ticTacToe[i][j]='X';
                }

            }
            
            System.out.println(); // println ->> print in column
          }

        System.out.println("Changed array "+Arrays.deepToString(ticTacToe));
    }

    */

    // ---------------------------------------------------- Finalize method ------------------------------
    // unreference objects(System.gc)
    // 3 ways : nulling
    //          assining to another objects
    //          anonymous objects(  new Object() ==> Anonymos object ) 
    // protected finalize method before garbage collection --- > object=null ---> System.gc
    // 





}