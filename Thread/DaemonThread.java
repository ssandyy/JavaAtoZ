package Thread;

// there are 2 daemon thread method i) setDaemon() and ii) isDaemon()

public class DaemonThread extends Thread{

    public static void main(String[] args) {
        System.out.println("Main Thread..!"); // this is mindate to run somthing in main thread to run its depending daemon thread. otherwise it will give blank output
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();
    }

    public void run(){
        System.out.println("this is run menthod");
        System.out.println(Thread.currentThread().getName());
        if (Thread.currentThread().isDaemon()) {
            System.out.println("This is Daemon Thread..!");
        }
        else {
            System.out.println("This is normal thread.!");
        }
    }
}
