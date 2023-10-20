package Thread;

public class DefiningThreadByExtendingThreadClass {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("this is main class thread..!");
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("this is child thread");
        }
    }
}
