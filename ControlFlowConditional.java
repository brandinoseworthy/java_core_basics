package com.teksystems_java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowConditional {
    public static void main(String[] args) {

        // 1. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if statement to print out “Less than 10” if x is less than 10.
        // Change x to equal 15 and notice the result (console should not display anything).

//        int x = 7;
//        x = 15; // now nothing prints
//        if (x < 10)
//        System.out.println("Less than 10");
//
        // Bonus: input a number and have the same scenario perform

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int y = scanner.nextInt();
//        if (y < 10)
//            System.out.print("Less than 10");

        // 2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” if x is greater than 10.
        // Change x to 15 and notice the result.

//            int x = 7;
//            x = 13; //
//
//             if (x < 10)
//                System.out.println("Less than 10");
//            else if (x > 10)
//                System.out.println("Greater than 10");

        // 3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
        // “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or
        // equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.

//        int x = 15;
//        x = 50; //
//
//        if (x < 10)
//            System.out.println("Less than 10");
//        else if ((x >= 10) && (x < 20))
//            System.out.println("Between 10 and 20");
//        else System.out.println("Greater than or equal to 20");

        // 4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write
        // an if-else statement that prints “Out of range” if the number is less than 10 or greater
        // than 20 and prints “In range” if between 10 and 20 (including equal to 10 or 20).
        // Change x to 5 and notice the result.

//        int x = 15;
//        x = 50; //
//
//        if ((x < 10) || (x > 20))
//            System.out.println("Out of range");
//        else if ((x >= 10) && (x <= 20))
//            System.out.println("In Range");

        // 5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: <60
//        Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range.” if the score is less than 0 or greater than 100.
//
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");

        int score = scanner.nextInt();
            if (score >= 90 && score <= 100)
                System.out.println("You received an A.");
            else if (score >= 80 && score <= 89)
                System.out.println("You received a B.");
            else if (score >= 70 && score <= 79)
                System.out.println("You received a C.");
            else if (score >= 60 && score <= 69)
                System.out.println("You received a D.");
            else if (score < 60 && score > 0)
                System.out.println("You received a F.");
            else if (score <= 0 || score >= 100)
            System.out.println("Out of Range.");


        //  6. Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to
        //  print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7.
        //  Don’t forget to include “break” statements in each of your cases.

//        Scanner scanner = new Scanner(System.in);
//
//        int x = 0;
//
//        while(true) {
//            System.out.print("Enter a number: ");
//            x = scanner.nextInt();
//        if (x < 1 &&  x > 7)
//            break;
//            System.out.println("Enter a number between 1 and 7");
//        }


    }// end main method


} // end ControlFlowConditional Class
