package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.examples.runnable.MyFirstRunnable;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */
class Exercise_03 {
    public static void main(String[] args) {
        RunnableTest1 threadTest = new RunnableTest1("Runnable#1", 10);


        //was forced to make SecondRunnable class static, how to get around this?
        Thread thread2 = new Thread(new SecondRunnable(), "Runnable#2");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();

        new Thread(new SecondRunnable(), "Runnable#3").start();


    }
}

class RunnableTest1 implements Runnable {

    Thread thread;

    RunnableTest1(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(1000);
                //the thread.sleep time never seemed to change for my program... is there a limit?
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}

class SecondRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(1000);
                System.out.println("In " + Thread.currentThread().getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}

