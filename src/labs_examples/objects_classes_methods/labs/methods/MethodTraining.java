package labs_examples.objects_classes_methods.labs.methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;


//fix method names
public class MethodTraining {

    static double a = 15;
    static double b = 5;
    static String person = "elizabeetle";


    public static void main(String[] args) {
//pass by value
        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        passByVal(15, 5);

        System.out.println("Value of 'a' remains unchanged: " + a);
        System.out.println("Value of 'b' remains unchanged: " + b);

//pass by reference
        System.out.println(person);
        passByRef();
        System.out.println("The original variable is changed because of the PassByRef() method: " + person);

//return the largest number
        largestNumber(15, 23, 73, 10);

        countConsonants("wouldn't");
//      if(int x == -1)...

        figurePrime(347);
    }

    //the three below demonstrate method overloading
    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    double addition(double a, double b, double c) {
        return a + b + c;
    }

    //the two below demonstrate pass by value vs pass by reference
    public static void passByVal(double a, double b) {
        a = a + 17;
        System.out.println("After pass by value a: " + a);
        b = b + 22;
        System.out.println("After pass by value b: " + b);
    }

    public static void passByRef() {
        person = "Jerry";
        System.out.println(person);
    }

    //find the largest number out of 4
    //try this without the library
    //iterate through an array...
    static int largestNumber(int d, int e, int f, int g) {
        int largest = Collections.max(Arrays.asList(d, e, f, g));
        System.out.println("The largest number is: " + largest);
        return largest;
    }


    //count how many consonants in a String
    public static int countConsonants(String word) {
        String vowels = "aeiou'-";
        String lowerCaseWord = word.toLowerCase();
        int count = 0;

        for (int index = 0; index < lowerCaseWord.length(); index++) {

            if (!vowels.contains(word.valueOf(lowerCaseWord.charAt(index)))) {
                count++;
            }
        }
        System.out.println(count);
        return -1;
    }

    //determine if a number is prime
    static void figurePrime(int number) {
        boolean flag = false;
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                flag = true;
                break;
            }
            i++;
        }
        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

    static void highestLowest() {
        //return a 2 numeral array that takes the lowest and highest from another, longer array
        //the large array is passed in as an argument


        int[] highestLowestArray = new int[1];
//        highestLowestArray[0] =

    }
}
