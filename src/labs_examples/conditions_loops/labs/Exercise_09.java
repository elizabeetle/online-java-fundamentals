package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main (String[] args) {

        int count = 1000;

        do {
            count = count - 3;
            System.out.println(count);

            if(count == 229)
                break;

        }while(count > 1);


    }
}
