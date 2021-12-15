package labs_examples.datatypes_operators.labs;



/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        final double radius = 3.14;
        final double height = 5;
        final double radiusSquare = radius * radius;
        final double pi = 3.14159;


        final double volume = (pi * radiusSquare * height);
        final double surface = (((2 * pi) * radius * height) + ((2 * pi) * radiusSquare));


        System.out.println(volume);
        System.out.println(surface);



    }
}