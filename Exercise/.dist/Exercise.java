
import java.lang.Character;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise{

    // EXERCISEs

        //ex245. Write a Java program which accepts students name, id, and marks and display the highest 
        //score and the lowest score

        //ex247.  Write a Java program which accepts three integers and check whether 
        //sum of the first two given integers is greater than third one.

        //ex170 Write a Java program to find the length of the longest consecutive 
        //sequence of a given array of integers

        //ex31 Write a program that accepts three numbers from the user and prints 
        //"increasing" if the numbers are in increasing order, "decreasing" (SORTING can be)

        //ex Create Employee an Manager classes , print information...

        //ex Create array of strings and check if has two string that are identical.



        // String/Character

        // string methods : length(),charAt(),compareTo(),copyValueOf(),split(),trim()
        /*
    public static void main(String args[]){
        String str1 = "Glass";
        String str2 = "Apple";
        int l = str1.length();
        char c = str2.charAt(1);
        int compare = str1.compareTo(str2);
        String s = new String("   Hello World   "); //boxin(wrapper classes) -- immutable
        char omega = '\u039A';

        if(compare==0){
            System.out.println("String are indentical.");
        }
        else{
            System.out.printf("Compare name str1 to str2 str:%d",compare);
        }

        System.out.println("\nString "+str1+" length of string is "+l+" on index one is "+c);
        
        System.out.println("\nTrimed string: "+s.trim());
        //System.out.println("Unicode for omega char: "+omega);
        
    }*/

    // Array
    
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];

        for(int i=0,j=result.length-1;i<arr.length;i++,j--){
            result[j] = arr[i];
        }
        return result;
    }

    //public static int binarySearch() // Methods
    //public static void sort()      //Method

    /*
    public static void main(String args[]){
        int[] array = {23,43,1,2,6,78};
        int[] reverse;

        // for(int i=0;i<array.length;i++){
        //     System.out.printf("Element %d value %d\n",i+1,array[i]);
        // }
        printArray(array);
        reverse=reverseArray(array);
        printArray(reverse);

        //maximum number of array
        int m = array[0];
        for(int j=0;j<array.length;j++){
            if(array[j]>m) m = array[j];
        }
        System.out.println("Maximum: "+m);
    }*/

    //insert data in array
    
    /*
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size,i;
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int[] array = new int[size];
       
        System.out.println("Input the number to the array: ");
        for(i=0;i<size;i++){
            int in = sc.nextInt();
            if(in%2==0){
                array[i]=in;                   //How to resolve problem with zeroes in the array
            }
        }
        System.out.println("Print array ");
        printArray(array);
    }*/

    // Methods

    // overloading (functions same name->another return value)
    // Command line arguments args[] (passing through args from terminal )
    // this keyword - method instances,constructors

    int age; // instance variable

    Exercise(){         // constructor that call constructor
        this(20);
    }

    Exercise(int age){ //constructor with parameter age
        this.age = age;
    }

    public void printing(){      //method
        System.out.println("Age "+this.age);
    }
    /*
    public static void main(String args[]){
        Exercise e1 = new Exercise(23);
        Exercise e2 = new Exercise();
        e1.printing();
        e2.printing();
    }*/

    //variable arguments(var-args)
    // f(double... numbers)

    public static void main(String args[]){
        printMax(1,2,4.5,45,7);
        printMax(new double[]{34,45.6,67,2}); //variable arguments
    }

    public static void printMax(double... numbers){
        if(numbers.length ==0){
            System.out.println("No argument to pass.");
            //return;
        }

        double result=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("Max value of value arguments: "+result);
    }


}