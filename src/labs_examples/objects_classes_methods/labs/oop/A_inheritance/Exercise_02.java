package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * 10 prints because class B has access to class A. When A a = new B(); happens, a new instance of Beta is created
 * with the name 'apple'. Java is using the Parent class which is A?
 */
class Alpha {
    int i = 10;
}

class Beta extends Alpha{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        Alpha apple = new Beta();



        System.out.println(apple.i);
    }
}