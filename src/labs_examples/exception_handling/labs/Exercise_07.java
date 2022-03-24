package labs_examples.exception_handling.labs;

import java.util.Scanner;
/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 extends Exception{

    public static void main(String[] args) {

        try {
            methodOne();
        } catch (Exercise_07 e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public String toString(){
        return "TooShort{You must be over 5ft to enter}";
    }

    public static void methodOne() throws Exercise_07 {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Fun House.");
        System.out.println("Are you over 5ft? y/n");
        String answer = scan.nextLine();

        if(answer.equalsIgnoreCase("n")){
            throw new Exercise_07();
        }
    }

}