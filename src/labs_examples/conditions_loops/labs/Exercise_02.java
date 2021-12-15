package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.println("Enter a number from 1 to 15. I'll give you a day of the week.");
        userNumber = scan.nextInt();

        if(userNumber < 8) {
            if(userNumber == 7){
                System.out.println("Sunday");
            }
            if(userNumber == 6){
                System.out.println("Saturday");
            }
            if(userNumber == 5){
                System.out.println("Friday");
            }
            if(userNumber == 4){
                System.out.println("Thursday");
            }
            if(userNumber == 3){
                System.out.println("Wednesday");
            }
            if(userNumber == 2){
                System.out.println("Tuesday");
            }
            if(userNumber == 1){
                System.out.println("Monday");
            }
        }else System.out.println("Other");


    }
}
