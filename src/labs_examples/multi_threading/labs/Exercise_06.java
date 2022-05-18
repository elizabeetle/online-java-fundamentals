package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    public static void main(String[] args) {


        PrintSequenceRunnable runnable1 = new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2 = new PrintSequenceRunnable(0);

        Thread t1 = new Thread(runnable1, "T1");
        Thread t2 = new Thread(runnable2, "T2");

        t1.start();
        t2.start();
    }

    static class PrintSequenceRunnable implements Runnable {

        public int max = 100;
        static int number = 1;
        int remainder;
        static Object lock = new Object();

        PrintSequenceRunnable(int remainder) {
            this.remainder = remainder;
        }

        @Override
        public void run() {
            while (number < max) {
                synchronized (lock) {
                    while (number % 2 != remainder) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        }
    }
}



