package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        tryCatch();
    }

    public static void tryCatch(){
        int[] nums = {15,324,57,1,6,0};

        try{
            int x = nums[10];
            System.out.println(x);
        }catch (Exception e){
            System.out.println("Something went wrong...");
        }finally {
            System.out.println("The try/catch is finished.");
        }
    }

}