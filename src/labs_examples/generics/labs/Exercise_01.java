package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */




class Exercise_01<T>{
    private T object;
    private T var;

    public T getVar(){
        return var;
    }

    public void setVar(T var){
        this.var = var;
    }

    public T getObject(){
        return object;
    }

    public void setObject(T object){
        this.object = object;
    }
}




class Main{
    public static void main(String[] args) {
        Exercise_01<String> no1 = new Exercise_01<>();
        Exercise_01<Integer> no2 = new Exercise_01<>();
        Exercise_01<Double> no3 = new Exercise_01<>();

        no1.setVar("Name: ");
        no1.setObject("Sam");
        System.out.println(no1.getObject());

        no2.setVar(8);
        no2.setObject(153);
        System.out.println(no2.getVar());

        no3.setVar(23.4356786723424);
        no3.setObject(2.5634573);
        double sum = no3.getObject() + no3.getVar();
        System.out.println("The sum of the variable and object is: " + sum);
    }
}