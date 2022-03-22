package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.Example;

public class Example2 {

        public void Try(){
//            Example.protectedExample(15, 20);
            //this error shows us that the protected method cannot be accessed from outside
            //the package even with proper imports
        }

        public int math(int a, int b){
            int sum = a * b;
            return sum;
        }
    }


