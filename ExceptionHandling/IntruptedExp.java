package ExceptionHandling;

public class IntruptedExp {
    /*public static void main(String[] args) {
        Thread.sleep(1000);                     //InterruptedException
        System.out.println("Hello..!");
    }*/


    public static void main(String[] args) {
        for(int i=0;i<=10;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                System.out.println("Hello InterruptedException..!" + e);
            }
        }

    }
}
