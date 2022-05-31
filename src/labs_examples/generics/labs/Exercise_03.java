package labs_examples.generics.labs;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Generics3{

    public static void main(String[] args) {
        System.out.println(doubleSum(45.254, 53));

        ArrayList<Integer> testerList = new ArrayList<>();

        testerList.add(34);
        testerList.add(5675);
        testerList.add(34);
        testerList.add(734);
        testerList.add(56);
        testerList.add(13);
        testerList.add(8976);
        testerList.add(432);
        testerList.add(47);

        largestElement(2, 5, testerList);
    }

    public static <N extends Number> double doubleSum(N num, N num2){
        return num.doubleValue() * num2.doubleValue();
    }

    public static void countElements(){

    }
/*
    public static <T> void exchange(T[] array, int a, int b){
        b = array[b];
        array[b] = array[a];
        array[a] = b;
    }
*/
    public static <T extends Comparable> void largestElement(int begin, int end, List<T> list){
        T max = list.get(begin);
        for (int i = begin; i < end; i++) {
            T elem1 = list.get(i);
            if (elem1.compareTo(max) > 0) {
                max = elem1;
            }
        }
        System.out.println(max);
    }
}