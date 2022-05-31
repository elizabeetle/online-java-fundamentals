package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */



import java.lang.reflect.Array;
import java.util.ArrayList;

class Demo<E>{
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();

        nums.add(456);
        nums.add(3245);
        nums.add(765);
        nums.add(43);
        nums.add(2);
        nums.add(56);


        System.out.println(sum(nums));
    }

    public static int sum(ArrayList<? extends Number> N){
        int sum = 0;

        for(int i = 0; i < N.size(); i++){
            sum += N.get(i).intValue();
        }
        return sum;
    }

}