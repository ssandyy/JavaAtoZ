package Thread;


class Thread1 extends Thread {
    Thread1(String s) {
        super(s);
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(getName()); // O/P : Thread 1
            System.out.println(Thread.currentThread().getName()); // O/P : main
            System.out.println("Hello Thread1 run function..!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Our Exception: "+e);
            }

        }
        System.out.println("Thread1 completed..!");
    }
}

class Thread2 extends Thread{
    Thread2(String s){
        super(s);
        start();
    }
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("This is Thread2..!");
            try{
                Thread2.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("End of Thread2..!");
    }
}
public class CallRun {
    public static void main(String[] args) {
        System.out.println("Hello Threading..!");
        Thread1 t1  =  new Thread1("Thread 1");
        t1.start();
        Thread2 t2 = new Thread2("Thread 2");
    }
}
