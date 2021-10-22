//package main;

import java.util.*;

//import animal.*;


public class mainclass{
    
    private animalclass a1; //private variable a1 type of class AnimalClass
    private animalclass a2;
    
    public mainclass(){ //constructor of objects
        
        a1 = animalclass("Bobi",34);
        a2 = animalclass("Jeffry",15);
    }
    
    public static void main(String[] args){
        
        mainclass obj1 = new mainclass();
        
        System.out.println("Name of Dog: "+obj1.a1.name+"he is "+obj1.a1.age+" years old.");
        
    }
}