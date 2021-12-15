package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] userNums = new int[10];

        System.out.println("Please enter 10 numbers.");
        userNums[0] = scan.nextInt();
        userNums[1] = scan.nextInt();
        userNums[2] = scan.nextInt();
        userNums[4] = scan.nextInt();
        userNums[5] = scan.nextInt();
        userNums[6] = scan.nextInt();
        userNums[7] = scan.nextInt();
        userNums[8] = scan.nextInt();
        userNums[9] = scan.nextInt();


        int sum = 0;
        int avg = 0;
        for (int numbers : userNums) {
            sum += numbers;
            avg = sum/10;
        }
        System.out.println("The sum of your numbers is: " + sum);
        System.out.println("The average of your numbers is: " + avg);


        scan.close();
    }
}