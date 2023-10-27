package Thread;

public class PriorityThread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());


        Test pt = new Test();
        pt.start();
//        System.out.println(pt.getPriority());
    }
}

class Test extends Thread{
    public void run(){
        System.out.println("Child Thread..!");
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
    }
}