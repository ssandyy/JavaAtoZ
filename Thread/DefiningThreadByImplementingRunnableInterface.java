package Thread;
public class DefiningThreadByImplementingRunnableInterface implements Runnable{
    public static void main(String[] args) {
        DefiningThreadByImplementingRunnableInterface d =new DefiningThreadByImplementingRunnableInterface();
        Thread t = new Thread(d);
        t.start();
        for (int j = 0; j <= 5; j++) {
            System.out.println("Value of j: "+j);
        }
    }
    public void run(){
        System.out.println("Runnable Interface..!");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Value of i: "+i);
        }
    }
}
//===================================================================================//

/*
class RunnableInterfaceDemo{
    public static void main(String[] args) {
        DefiningThreadByImplementingRunnableInterface d =new DefiningThreadByImplementingRunnableInterface();
        Thread t = new Thread(d);
        t.start();
        for (int j = 0; j <= 5; j++) {
            System.out.println("Value of j: "+j);
        }
    }
}
public class DefiningThreadByImplementingRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Runnable Interface..!");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Value of i: "+i);
        }
    }
}
*/
