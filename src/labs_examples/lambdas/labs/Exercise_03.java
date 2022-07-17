package labs_examples.lambdas.labs;

import java.util.*;
import java.util.function.Function;

@FunctionalInterface
interface Print{
    void print(String msg);
}

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Function<Integer, String> function = Integer::toBinaryString;
        System.out.println(function.apply(22));


        Exercise_03 instanceMethodReference = new Exercise_03();
        Print printable = instanceMethodReference::display;
        printable. print("Hello World");



        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add("mango");
        fruits.add("banana");

        Function<List<String>, Set<String>> setFunction = HashSet::new;
        System.out.println(setFunction.apply(fruits));
    }

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
}