// package invesment;

// import java.text.DecimalFormat;
// //import java.io.*;
// //import java.util.*;
// //import java.util.ArrayList;
// //import java.util.Arrays;
// import java.util.Scanner;

// //Description
// // - enter buying price per chare
// // - closing price on subsequent day
// // - calculate aggregate earnings/losses after each day
// // - leave program when closing price is negative

// public class Main{

//     public static void main(String[] args){

//         System.out.println("Invesment");

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your buying price per share.");

//         double buyingPrice = sc.nextDouble();

//         int day = 1;
//         double closingPrice = 0.1;
//         DecimalFormat df = new DecimalFormat("0.00"); // define round function

//         while(true){

//             System.out.println("Enter closing price for day"+day+" (any negative value to leave)");

//              closingPrice = sc.nextDouble();

//             if(closingPrice < 0.0 )break;
//             double earning = closingPrice - buyingPrice;

//             if(earning > 0 ){
//                 System.out.println("After day "+day+" ,you earned "+ df.format(earning) +" per share");
//             }
//             else if(earning < 0){
//                 System.out.println("After day "+day+" ,you lost "+ df.format(-earning) +" per share");   
//             }
//             else{
//                 System.out.println("After day "+day+" ,you have no earnings.");
//             }

//             day++;
//         }
//         sc.close();

//     }


// }