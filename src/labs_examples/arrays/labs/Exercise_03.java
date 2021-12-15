package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] numbers = new int[5][5];
        int count = 0;
        //local variables does not get a default

        for(int i= 0; i < numbers.length; i++){
           for(int j = 0; j < numbers[i].length; ++j){

                count += 3;
                numbers[i][j] = count;
                System.out.print(numbers[i][j] + "-");
            }
            System.out.println();
        }
        
    }
}
