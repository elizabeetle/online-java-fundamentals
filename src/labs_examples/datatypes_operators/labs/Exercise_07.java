package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here
       // int hoursinDay = 12;
       // int minutesinDay = hoursinDay * 60;
        //is it better to make an equation here instead of jumping right to the secondsinDay variable?

        int secondsinDay = 86400;
        int daystoSeconds = (days * secondsinDay );

        System.out.println("There are " + daystoSeconds + " seconds in " + days + " days.");


        scanner.close();
    }

}