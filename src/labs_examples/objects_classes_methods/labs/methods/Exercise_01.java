package labs_examples.objects_classes_methods.labs.methods;



/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        System.out.println(multiply(72, 54));
        System.out.println(divide(34225, 5));
        joker("Why are cats bad storytellers? Because they only have one tale.");
        System.out.println(yearsToSeconds(5));


        int count1 = arrayArgs("nami", "jinx", "lucian", "vi");
        int count2 = arrayArgs("lucian", "jinx", "seraphine", "kaisa");
        int count3 = arrayArgs("aurelian sol", "evelynn", "ahri");


        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joker(String joke){
        System.out.println(joke);
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int years){
        int seconds = years * 365 * 24 * 60 * 60;

        return seconds;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int arrayArgs(String... args){
        int count = 0;

        for(String x : args){
            count++;
        }

        return count;

    }






}
