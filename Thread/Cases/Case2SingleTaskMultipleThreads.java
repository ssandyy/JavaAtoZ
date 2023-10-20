package Thread.Cases;

public class Case2SingleTaskMultipleThreads extends Thread {
    public static void main(String[] args) {
        Case2SingleTaskMultipleThreads cs1 =  new Case2SingleTaskMultipleThreads();
        cs1.start();
        Case2SingleTaskMultipleThreads cs2 =  new Case2SingleTaskMultipleThreads();
        cs2.start();
    }
    public void run(){
        System.out.println("Task");
    }
}
