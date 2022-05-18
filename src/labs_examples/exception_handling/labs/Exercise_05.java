package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        try{
            int x = division(5,0);
        }catch(ArithmeticException e){
            System.out.println("an mathematics exception was thrown from division() method");
        }
        System.out.println("Program Complete");
    }

    public static int division(int a, int b) throws ArithmeticException{
        return a/b;
    }
}