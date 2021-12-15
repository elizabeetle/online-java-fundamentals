package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userWord;
        String vowels = "aeiou";
        char firstVowel;

        System.out.println("Type any word and I will give back the first vowel in your word.");
        userWord = scan.nextLine();


        char[] charsFromUserString = userWord.toCharArray();

        while(userWord.toLowerCase().indexOf(vowels) == -1){

        }

        System.out.println(charsFromUserString);


      //  System.out.println("Your word's (" +userWord + ") first vowel is: " + firstVowel);

    }
}
