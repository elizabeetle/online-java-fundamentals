package labs_examples.conditions_loops.labs;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lower;
        int upper;

        System.out.println("Input the lowest number in your number range.");
        lower = scan.nextInt();

        System.out.println("Input the highest number in your number range.");
        upper = scan.nextInt();


        int sum = 0;
        double average = 0;
        int counter = 0;
        for(int i = lower; i <= upper; i++) {

            sum += i;
            counter++;
            average = sum/counter;


        }
        System.out.println("The sum of your range of numbers is: " + sum);
        System.out.println("The average of your range of numbers is:" + average);


    }
}


