package labs_examples.arrays.labs;



/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {


        int[][] numbers = new int[6][10];

        for (int i = numbers.length - 1; i >= 0; i -= 2){

            for(int j = numbers[i].length - 1; j >= 0; j -= 2){
               numbers[i][j] = i + j;
               System.out.print(numbers[i][j] + ">");
            }
            System.out.println();
        }


    }
}
