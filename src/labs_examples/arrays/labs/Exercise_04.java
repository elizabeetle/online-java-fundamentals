package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {


    public static void main(String[] args) {

        int[][] numbers = new int[3][6];

        for (int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = (i + j);
            }
        }

        for (int[] outer : numbers){
            for (int val : outer){
                System.out.print(val + "->");
            }
            System.out.println();
        }
    }

}
