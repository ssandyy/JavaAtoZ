import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int answer = 1;
        do {
            Scanner num = new Scanner(System.in);
            System.out.println("Do you want to enter more numbers? (0/1)");
            answer = num.nextInt();
        } while (true);
        {
            System.out.println("Thank you for using the program!");
        }
    }
}