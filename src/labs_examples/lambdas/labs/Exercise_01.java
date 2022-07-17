package labs_examples.lambdas.labs;

import java.sql.SQLOutput;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */


public class Exercise_01 {


//    1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void

    @FunctionalInterface
    public interface exercise_01{
        public void sampleInterface();

        public default int someMultiplication(int a, int b){
            return a * b;
        }
    }


//    3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
//       value of the same type as the parameter
    @FunctionalInterface
    public interface demoPart3 {
        public int calculate(int x);
    }


//     5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
//     value
    @FunctionalInterface
    public interface demoPart4 {
        public double calculateDoubles(double x, double y);
    }




    public static void main(String[] args) {

//      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//         an anonymous inner class from this interface.

        exercise_01 obj = () -> {
            System.out.println("Lambda time");
        };

        obj.sampleInterface();

        exercise_01 obj2 = new exercise_01() {
            @Override
            public void sampleInterface() {
                System.out.println("Hello World!");
            }
        };


//      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//         an anonymous inner class from this interface.
        int a = 56;

        demoPart3 demo = (int x) ->{
           return x * x;
        };


        System.out.println(demo.calculate(a));

        demoPart3 demo2 = (int x) ->{
          return (x * x) + (x * x);
        };

        System.out.println(demo2.calculate(a));

        demoPart3 demo3 = new demoPart3() {
            @Override
            public int calculate(int x) {
                return (x + x) / 3;
            }
        };

        System.out.println(demo3.calculate(a));


//      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
//         an anonymous inner class from this interface.
        double b = 29.37823;
        double c = 31.8923;

        demoPart4 demo4Part1 = (double x, double y) ->{
            return x / y;
        };

        System.out.println(demo4Part1.calculateDoubles(b, c));

        demoPart4 demo4Part2 = new demoPart4() {
            @Override
            public double calculateDoubles(double x, double y) {
                return x * y + x;
            }
        };

        System.out.println(demo4Part2.calculateDoubles(a, b));


        demonstrateConsumer();
        demonstrateBiPredicate(5, 4.3);
        demonstrateBiPredicate(3, 10.348732);

    }

//      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.

    private static void demonstrateBiPredicate(int x, double y){
        BiPredicate<Integer, Double> biPredicate = (a, b) -> a + b > 10; {
            System.out.println("Result: " + biPredicate.test(x, y));
        };
    }

    private static void demonstrateConsumer() {
        Consumer<Integer> consumer = a -> {
            int b = a + 18;
            System.out.println("Output of 'a': " + a);
            System.out.println("Output of 'b': " + b);
        };
            consumer.accept(17);
    }



}

