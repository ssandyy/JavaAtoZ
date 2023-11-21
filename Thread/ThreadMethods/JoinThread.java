package Thread.ThreadMethods;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Medical md = new Medical();
        md.start();
        md.join();

        TestDrive td = new TestDrive();
        td.start();
        td.join();

        OfficerSignature os = new OfficerSignature();
        os.start();
    }
}
class Medical extends Thread {
    public void run(){

        try {
            System.out.println("Medical procedure started..!");
            Thread.sleep(2000);
            System.out.println("Medical Procedure completed..!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("TestDrive Process Started..!");
            Thread.sleep(3000);
            System.out.println("TesDrive successfully completed..!");
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

class OfficerSignature extends Thread{
    public void run(){
        try{
            System.out.println("Form Submitted to offer..!");
            Thread.sleep(5000);
            System.out.println("Application Approved..!");
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}