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
        // final variable,method,class
        // variable: can not override,inheritance,change
        // method : can not overriding
        // class : can not extend
        // ----------------------------------------- PACKAGE ---------------------------------
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

     //Inteface 
     // - solve probelm with Inheritance -> can impleents more than one ...
     // - define methods outide of inteface
     // - if i want to have public inteface needs to be define in separate file !!!!!

     





}