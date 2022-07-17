package labs_examples.lambdas.labs;

import java.sql.SQLOutput;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {


        demoPredicate(18);
        demoSupplier("Beetle");
        //why does the below not show numbers after the decimal?
        demoIntToDouble(100, 3);
        demoFunction(46);
        demoUnaryOperator("friends");
        demoIntConsumer(2);
        demoBooleanSupplier();
        demoBiFunction(3, 7.453);
        demoBiConsumer(5, 76);
        demoIntPredicate(6);

    }

    private static void demoPredicate(int x){
        Predicate<Integer> predicate = (a) -> a > 15; {
            System.out.println("Result: " + predicate.test(x));
        };
    }

    private static void demoSupplier(String x){
        Supplier<String> name = () -> x;
        System.out.println("My name is " + name.get() + ".");
    }

    private static void demoIntToDouble(int x, int y){
        int b = x/y;
        IntToDoubleFunction changeToDouble = value -> b;
        System.out.println(changeToDouble.applyAsDouble(b));
    }

    private static void demoFunction(int c){
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println("Half of your number is " + half.apply(c));
    }

    private static void demoUnaryOperator(String yourWord){
        UnaryOperator<String> unary = a -> "Hello " + a;
        System.out.println(unary.apply(yourWord));
    }

    private static void demoIntConsumer(int x){
        IntConsumer consumer = a -> {
            int b = a + 18;
            System.out.println("Output of 'a': " + a);
            System.out.println("Output of 'b': " + b);
        };
        consumer.accept(x);
    }

    private static void demoBooleanSupplier(){
        BooleanSupplier bool = () -> true;
        System.out.println(bool.getAsBoolean());
        int x =100;
        int y = 70;
        bool = () -> x == y;
        System.out.println(bool.getAsBoolean());
    }

    private static void demoBiFunction(int x, double y){
        BiFunction<Integer, Double, Double> biFunction = (t, u) -> (t + u);
        System.out.println(biFunction.apply(x, y));
    }

    private static void demoBiConsumer(int x, int y){
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(x, y);
    }

    private static void demoIntPredicate(int x){
        IntPredicate predicate = (a) -> a > 15; {
            System.out.println("Result: " + predicate.test(x));
        };
    }



}