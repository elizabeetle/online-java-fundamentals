package labs_examples.exception_handling.labs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


public class Exercise_02 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        tryCatch();
    }

    public static void tryCatch(){
       ArrayList<Integer> numbs = new ArrayList<>();

        try{
            System.out.println("Enter 5 numbers.");

            for(int i = 0; i < 5; i++){
                numbs.add(scan.nextInt());
            }

            System.out.println(numbs);
            System.out.println(numbs.get(10));
        }catch(IndexOutOfBoundsException a){
            System.out.println("Your index number does not exist.");
        }catch(InputMismatchException b){
            System.out.println("You did not enter a number.");
        }

    }

}