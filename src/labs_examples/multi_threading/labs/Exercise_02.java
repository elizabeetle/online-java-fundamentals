package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02{
    public static void main(String[] args) {

        System.out.println("Starting processes...");
        MyExtendedThread thread1 = new MyExtendedThread("Thread 1");

    }
}

class MyExtendedThread extends Thread {

    MyExtendedThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 6; count++) {
                Thread.sleep(5000 );
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch(InterruptedException exc){
                System.out.println(getName() + " interrupted.");
            }
            System.out.println(getName() + " terminating.");
    }
}