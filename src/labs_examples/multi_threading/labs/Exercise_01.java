package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.examples.runnable.MyFirstRunnable;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
class Exercise_01 {
    public static void main(String[] args) {
        MyFirstRunnable threadTest = new MyFirstRunnable("Runnable#1");

        //was forced to make SecondRunnable class static, how to get around this?
       Thread thread2 = new Thread(new SecondRunnable(), "Second option");
       thread2.start();

       new Thread(new SecondRunnable(), "Third Option").start();

    }

class RunnableTest1 implements Runnable{

    Thread thread;

    public void MyFirstRunnable(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(50000, 23);
                //the thread.sleep time never seemed to change for my program... is there a limit?
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        }catch(InterruptedException exc){
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}

static class SecondRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try{
            for(int count = 0; count < 5; count++){
                Thread.sleep(1000);
                System.out.println("In " + Thread.currentThread().getName() + ", count is " + count);
            }
        }catch(InterruptedException exc){
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}
}