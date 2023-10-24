package Thread.ThreadMethods;

public class GetSetNameAlive {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//main
        Thread.currentThread().setName("Sandy");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());


        Test t = new Test();
        t.start();
        t.setName("Dilip");
        System.out.println(t.isAlive());
    }
}
class Test extends Thread{
    public void run(){
        System.out.println("this is task run method..!");
        System.out.println(Thread.currentThread().getName());

    }
}
