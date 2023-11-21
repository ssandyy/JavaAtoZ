package Thread;

public class DefiningThreadByExtendingThreadClass {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        new MyThread2().start(); // annonymous object

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
class MyThread2 extends Thread{
    public void run(){
        for (int z = 0; z <= 5; z++) {
            System.out.println("this is child thread2");
        }
    }
}


//------------------------------------------   OR    ------------------------------------------------//

/*
public class DefiningThreadByExtendingThreadClass extends Thread {
    public static void main(String[] args) {
        DefiningThreadByExtendingThreadClass dt = new DefiningThreadByExtendingThreadClass();
        dt.start();
        for (int i = 0; i <=5; i++) {
            System.out.println("Value of i: "+i);
        }
    }
    public void run(){
        System.out.println("Run method ");
        for (int j = 0; j <= 5; j++) {
            System.out.println("Values of j:"+j);
        }
    }
}
*/