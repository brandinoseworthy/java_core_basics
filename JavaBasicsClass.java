package com.teksystems_java;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class JavaBasicsClass {

    public static void main(String[] args) {
// call upon methods for exercises:

        // ArrayExercises.exercise1(); // 2/24 Complete
        // ArrayExercises.exercise2(); // 2/24 Complete
       // ArrayExercises.exercise3(); // 2/24 Complete
       // ArrayExercises.exercise4(); // 2/24 Complete
        // ArrayExercises.exercise5(); // 2/24 Complete
       // ArrayExercises.exercise6(); // 2/24 Complete
       // ArrayExercises.exercise7(); // 2/24 Complete
      //  ArrayExercises.exercise8(); // 2/25 Complete
        // ArrayExercises.exercise9(); // 2/25 Complete
        // ArrayExercises.exercise10(); // 2/25 Complete

        // 1. Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result.

//        int x = 12;
//        int y = 25;
//        int sum = x + y;
//
//        System.out.println("1) The sum of x and y is... " + sum + ".");

        //2. Write a program that declares 2 double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result.

//        double a = 600.543;
//        double b = 10000.111;
//        double sum2 = a + b;
//
//        System.out.println("2) The sum of a and y is..." + sum2 + ".");

        // 3. Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result.
        // What variable type must the sum be?

//        int c = 10;
//        double d = 100.25;
//        double sum3 = d + c;
//
//        System.out.println("3) The sum of c and d is..." + sum3 + ". \n The sum variable must be a double to return a result that contains a double value.");

        //4. Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable.
        // Print out the result.
        // Now change the larger number to a decimal.
        // What happens? What corrections are needed?

//        double e = 100.0;
//        int f = 50;
        // 100 / 50 = 2 .. now we changed the larger number to a decimal
        // e as 100.0 error because of int datatype
        // double e .. still an error because the division variable is not a double as well
//
//        double division = e / f;
//        System.out.println("4) Errors will come up, you need to change the datatype for e to a double AND the divsiion variable that relies on " +
//                "\n both the e variable and the f variable. This will produce..." + division + ".");

        // 5. Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
        // Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
//
//        double g = 525.25;
//        double h = 25.25;
//        double division2 = g / h;
//
//        System.out.println("5) By casting the results to an integer, the result drops the decimal and everything that follows the decimal point " +
//                "\n to return just this integer value ... " + (int) division2 + ".");
//
//        //Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
//        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign to q. Print q again.
//
//        int x2 = 5;
//        int y2 = 6;
//        double q = (double) y2 / x2;
//
//        System.out.println("6) By casting y2 to a double, the variable q also needs to be a double. Instead of returning 1, " +
//                "\n print q will return.. " + q + ".");
//
//        //7. Write a program that declares a named constant and uses it in a calculation. Print the result.
//
//        final double PI = 3.1415926;
//        int radius = 4;
//
//        double area = (radius * radius) * PI;
//
//        System.out.println("7) The area of a circle with a radius of 4 cm is " + area + "cm .");

        /*8. Write a program where you create 3 variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete
        an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product.
        Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the
        totalSale amount. Be sure to format the results to 2 decimal places.
         */
//
//        double coffee = 2.50;
//        double cappaccino = 3.25;
//        double espresso = 4.25;
//        final double SALES_TAX = 1.0625;
//
//        int coffeeOrders = 3;
//        int cappacinoOrders = 4;
//        int espressoOrders = 2;
//
//        double subtotal = (coffee * coffeeOrders) + (cappaccino * cappacinoOrders) + (espresso * espressoOrders);
//        double totalSale = subtotal * SALES_TAX ;
//        DecimalFormat totalSaleFormat = new DecimalFormat("#.00");
//        // you can use this Reference to change the format of the double that prints out
//        System.out.println("8) The total sale of this order including tax is $" + totalSaleFormat.format(totalSale) + ".");

    }// end main


}//end class
