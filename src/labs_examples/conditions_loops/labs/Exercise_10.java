package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {


    public  static void main(String[] args) {


        int count = 1000;

        do {
            count = count - 3;

            if (count == 10)
                continue;
                //skips printing the number 10 even though its part of the backwards count
            System.out.println(count);


        } while (count > 1);

    }
}
