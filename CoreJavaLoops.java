package com.teksystems_java;

import java.util.Arrays;

import static java.lang.Integer.reverse;

public class CoreJavaLoops {
    public static void main(String[] args) {
        // 1. Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.

//      int [] toTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      for (int i = 0; i <= (toTen.length -1); i++ );
//      System.out.println(Arrays.toString(toTen));
//
        // 2. Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.

//        int number = 0;
//        while((number <= 100)){
//            if (number % 10 == 0)
//                System.out.println(number);
//            number++;
//        }

        // 3. Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.

//        int number = 1;
//        do {
//            System.out.println(number);
//            number++;
//        }
//        while(number <= 10);

       // 4. Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5,
        // but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.

//        for (int i = 1; i <= 100; i++) {
//            if (i >= 25 && i <= 75) {
//                continue; }
//            if (i % 5 == 0) {
//                System.out.println(i); } }

        // 5. Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5,
        // but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.


//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0) {
//                System.out.println(i); }
//            if (i > 50) {
//                break; }    }

        // 6. Write a program that uses nested for-loops to output the following:

//        for (int i = 1; i <= 2; i++) {
//            System.out.println("Week " + i);
//                for (int k = 1; k <= 5; k++){
//                    System.out.println("Day " + k);
//                }
//        }
//
        // ***NEED TO DO 7.Write a program that returns all the available palindromes within 10 and 200.
//        int i = 0;
//        int numberReversed = reverse(i);
//
//        for ( i = 10; i <= 200; i++){
//
//            if (i == numberReversed) {
//                System.out.println(i);
//            }
//        }

        // 8. return the fibonacci series where the value is less than 50.
//        int count = 0;
//        int nextNumer = 0;
//        int previousNumber = 1;
//        System.out.print("The fibonacci series under the value of 50 is: \n");
//
//        for (int i = 1; nextNumer <= 50; ++i)
//        {
//            System.out.print(nextNumer+" ");
//            int sumNumbers = nextNumer + previousNumber;
//            nextNumer = previousNumber;
//            previousNumber = sumNumbers;
//        }

        //9. Write a program that nests a for-loop inside another.
        // Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
//
//        for (int i = 1; i <= 10; i++) {
//                for (int k = 1; k <= 5; k++){
//                    System.out.println("Inner loop k: " + k + " Outter loop i: " + i);
//                }
//        }


    } // end main method



} // end CoreJavaLoops class
