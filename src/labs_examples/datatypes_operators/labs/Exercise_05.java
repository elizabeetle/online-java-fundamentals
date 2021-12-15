package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {


        int a = 17;
        int b = a + 3;
        int c = b -16;
        int d = a * c;
        int e = b /d;
        int f = a % c;
        int g = 10;
        int h = 11;
        int i = 25;
        int j = 32;
        int k = 32;

        if (a < 20 & b < 20){
            System.out.println("both a & b are less than 20");
        }
        // now your turn :)

        if (i < 15 && j > 30) {
            System.out.println("i is less than 15 and j is greater than 30");
        }

        if (j==k | i != c) {
            System.out.println("j could be equal to k or i could not be equal to c");
        }

        if (i >= h || j == k) {
            System.out.println("i is greater than or equal to h or j is equal to k");
        }

        if (i >= h ^ j == k){
            System.out.println("either i is greater than or equal to h or j is equal to k");
        }

        if (i != 16) {
            System.out.println("i is 25");
        }
    }

}

