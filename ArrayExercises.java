package com.teksystems_java;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class ArrayExercises {



    // 1. Write a program that creates an array of integers with a length of 3.
    // Assign the values 1, 2, and 3 to the indexes. Print out each array element.

//    public static void exercise1() {
//        int[] firstArray = {1, 2, 3};
//        for (int i = 0; i < firstArray.length; i++) {
//            System.out.println(firstArray[i]);
//        }
// Result:
// 1
// 2
// 3
//
//Process finished with exit code 0
//
//    } // end exercise1 method

    // 2. SKIPPED Write a program that returns the middle element in an array.
    // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce
    // the following output: 7

//    public static void exercise2() {
//        int[] arr2 = {13, 5, 7, 68, 2};
//        int middle = arr2[(arr2.length -1)/2];
//            System.out.println("The middle element of arr2 is: "+ middle);
//// Result:
//// The middle element of arr2 is: 7
//    } // end exercise2 method

// 3.Write a program that creates an array of String type and initializes
// it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
// Make a copy using the clone( ) method.
// Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

//    public static void exercise3() {
//
//        String [] colors = {"red","green", "blue", "yellow"};
//        int arrayLength = colors.length;
//
//            System.out.println("The length of this colors array is: " + colors.length);
//
//            String[] copyOfColors = colors.clone();
//            System.out.println("The color array was copied into copyOfColors and it also holds these values: " + Arrays.toString(copyOfColors));

// Results:
//The length of this colors array is: 4
//The color array was copied into copyOfColors and it also holds these values: [red, green, blue, yellow]


 //   } // end exercise3 method

    //4. Write a program that creates an integer array with 5 elements (i.e., numbers).
    // The numbers can be any integers.  Print out the value at the first index and the last index
    // using length - 1 as the index. Now try printing the value at index = length
    // ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced.
    // Now try to assign a value to the array index 5. You should get the same type of exception.

//    public static void exercise4() {
//        int[] arr4 = {7, 9, 28, 8, 4};
//        System.out.println("The last index is: "+ (arr4.length-1) + " And, the first index is: " + arr4[0]);
//
//       // System.out.println(arr4[arr4.length]); // Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//
//       // arr4[5] = 12; // Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//
//    }// end exercise4 method


    // 5. Write a program where you create an integer array with a length of 5.
    // Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.

//    public static void exercise5() {
//
//        int[] arr5 = new int[5];
//            for(int i = 0; i < arr5.length; i++) {
//                arr5[i] = i;
//                System.out.println(arr5[i]);
//            }
// Result:
//        0
//        1
//        2
//        3
//        4

 //   } //end exercise5 method

// 6.Write a program where you create an integer array of 5 numbers.
// Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

//    public static void exercise6() {
//        int[] arr6 = new int[5];
//            for(int i = 0; i < arr6.length; i++) {
//                arr6[i] = i * 2;
//                System.out.println(arr6[i]);
//            }
// Result:
//        0
//        2
//        4
//        6
//        8

 //   } // end exercise6 method

// 7. Write a program where you create an array of 5 elements.
// Loop through the array and print the value of each element, except for the middle (index 2) element.

//    public static void exercise7() {
//         String[] arr7 = {"Damon", "Cuddles", "Athena", "Michael", "Brandi"};
//         String middle2 = arr7[(arr7.length-1)/2];
//         for(int i = 0; i < arr7.length; i++){
//                if (arr7[i] != middle2) {
//                 System.out.println(arr7[i]); } // ends if statement
//            } // ends for statement
// Result:
//Damon
//Cuddles
//Michael
//Brandi   } // ends exercise7 method

    // 8. Write a program that creates a String array of 5 elements and swaps the first element with the middle element
    // without creating a new array.

//    public static void exercise8() {
//        String[] arr8 = {"Alligator", "Bear", "Caterpillar", "Dolphin", "Eagle"};
//           // for(int i = 0; i < arr8.length; i++){
//            System.out.println(Arrays.toString(arr8));
//
// need help with reverseArray()


 //   } // end exercise8 method


    // 9.Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    // Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13

    public static void exercise9() {
        int [] arr9 = {4, 2, 9, 13, 0};
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        Arrays.sort(arr9);
        System.out.println(Arrays.toString(arr9)); //Array in ascending order: 0, 1, 2, 4, 9, 13

        for(int i = 1; i < arr9.length; i++){
            if (arr9[i] < minValue){
                minValue = arr9[i];
                System.out.println("The smallest number is: " + minValue);}


        }


    } // end exercise9 method



} // end ArrayExercises Class
