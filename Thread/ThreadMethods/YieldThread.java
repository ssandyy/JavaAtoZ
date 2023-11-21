package Thread.ThreadMethods;

public class YieldThread extends Thread {
    public static void main(String[] args) {
        YieldThread yt = new YieldThread();
        yt.start();

        Thread.yield();

        for (int i = 0; i < 5; i++) {
            System.out.println("This is main thread,,! parent");
        }
    }

    public void run(){
        //Thread.yield();
        for (int i = 0; i <= 5; i++) {
            System.out.println("This is run task ..! child1 ");
        }
    }
}
