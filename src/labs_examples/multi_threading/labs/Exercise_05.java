package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */
public class Exercise_05 {
    public static void main(String[] args) {

    }
}

class DataTransfer{
    private String packet;

    private boolean transfer = true;

    public synchronized void send(String packet){
        while (!transfer){
            try{
                wait();
            }catch (InterruptedException exc){
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + exc);
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive(){
        while(transfer){
            try{
                wait();
            }catch (InterruptedException exc){
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted" + exc);
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}