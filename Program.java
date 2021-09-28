// MY FIRST JAVA PROGRAM 

// import java.util.Scanner;
// import java.util.*;
// import java.lang.*;
// import java.io.*;


 public class Program{
    
//     public void Answer(){
//         System.out.println("Thanks for asking,Im fine.");
//     }

    
    
//     public static void main(String args[]){
//         System.out.println("Hello World!");
//         System.out.println("How are you ?");
//         //Program.Answer(); // you must create a object to call some method from class...
//     }
 

// Constructors -- creating an object
// - no argument constructors
// - parameter constructors
    
    // public static void main(String args[]){
    //     String name = "Jeff";    
    //     int age = 12;
    //     boolean result = name instanceof String;
    //     age++;
    //     System.out.println("Result: "+result+"Age"+age);
    // }

    // loops, for,while,do while
    /*
        public static void main(String args[]){
            int [] numbers = {2,34,56,12,10,1};
            String [] names = {"Jack","Mary","Simon","Filip"};
            int num=20;
            int k=10;

            for(int x : numbers){
                System.out.println("element "+x);
            }
            System.out.println("\n");
            for (String name : names ){
                System.out.println("Name: "+name);
            }
            System.out.println("\n");
            while(num > 5){
                System.out.println("Numbers: "+num);
                num--;
            }
            System.out.println("\n");
            do{
                System.out.println("value: "+k);
                k++;
            }while(k < 20);
        } */

        //Desition making,input function(Scanner)
        // ex.5 
        /*
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            int result;

            System.out.println("Enter the number: ");
            int num1=in.nextInt();

            System.out.println("Enter the second number: ");
            int num2=in.nextInt();

            if((num1 >=10) && (num2>=10)){
                result = num1*num2;
            }
            else{
                result=0;
            }
            

            System.out.println("Multiplay of "+num1+" and "+num2+" is "+result);
        }*/

        // ex.33 sum of number digits

        /*
        public static int sumDigits(long num){
            int sum=0;

            while(num!=0){
                sum+=num%10; // (num/10)%10
                num/=10;
            }
            return sum;
        }
        
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number: ");
            long n = in.nextLong();
            System.out.println("Sum of digits is: "+sumDigits(n));
        }
        */

        

 }
