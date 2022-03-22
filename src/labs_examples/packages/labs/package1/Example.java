package labs_examples.packages.labs.package1;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add(0, "conservation");
        words.add(1, "deforestation");
    }

    protected int protectedExample(int a, int b){
        int sum = a + b;
        return sum;
       }
}

