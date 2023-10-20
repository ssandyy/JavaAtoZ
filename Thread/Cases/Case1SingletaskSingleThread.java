package Thread.Cases;

public class Case1SingletaskSingleThread extends Thread {
    public static void main(String[] args) {
        Case1SingletaskSingleThread c1 =  new Case1SingletaskSingleThread();
        c1.start();
    }
    public void run(){
        System.out.println("This is run method..!");
    }
}
