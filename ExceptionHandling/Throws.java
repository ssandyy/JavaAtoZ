package ExceptionHandling;

public class Throws {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<5;i++){
            Thread.sleep(4000);
            System.out.println("This thread will generate in 4 sec..!");
        }
        System.out.println("Thread loop ended..!");
    }
}
