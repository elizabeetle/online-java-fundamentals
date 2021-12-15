package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below


        int g = 10;
        int h = 11;
        int i = 25;
        int j = 32;
        int k = 32;

        if (g < h) {
            System.out.println("a is less than b");
        }
        // now your turn :)
        if (g <= h) {
            System.out.println("a is less than or equal to b");
        }

        if (j > g) {
            System.out.println("j is greater than g");
        }

        if (i >= h) {
            System.out.println("i is greater than or equal to h");
        }

        if (j == k) {
            System.out.println("j is equal to k");
        }

        if (j != h) {
            System.out.println("j is not equal to h");

        }
    }

}

