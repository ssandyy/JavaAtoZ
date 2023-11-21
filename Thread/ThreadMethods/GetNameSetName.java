package Thread.ThreadMethods;

public class GetNameSetName {
    public static void main(String[] args) { //  this thread is created by JVM
        System.out.println(Thread.currentThread().getName());// main
        Thread.currentThread().setName("Sandeep");
        System.out.println(Thread.currentThread().getName()); // Sandeep
//        System.out.println(10/0); // Exception in thread "Sandeep" java.lang.ArithmeticException
//        System.out.println("Hello");
    }
}
