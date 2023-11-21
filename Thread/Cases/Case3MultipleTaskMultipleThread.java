package Thread.Cases;

// Multiple task handling  Multiple threads..!
public class Case3MultipleTaskMultipleThread {
    public static void main(String[] args) {
        MyThread1 cs =  new MyThread1();
        cs.start();
        MyThread2 cs1 = new MyThread2();
        cs1.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("MyThread1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("MyThread2..!");
    }
}

class MyThread3 extends Thread{
    public void run(){
        System.out.println("MyThread..3");
    }
}