package Thread.ThreadMethods;

public class InterrupThread extends Thread{
    public static void main(String[] args) {
        InterrupThread it = new InterrupThread();
        it.start();
        //it.interrupt();
    }

    public void run() {
        try {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is "+Thread.currentThread().getName()+" Task-"+i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
