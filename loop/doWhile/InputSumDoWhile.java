package loop.doWhile;
public class InputSumDoWhile {
    public static void main(String[] args) {
        char choice;
        do {
            System.out.print("Enter the first number: ");
            int number1 = new java.util.Scanner(System.in).nextInt();

            System.out.print("Enter the second number: ");
            int number2 = new java.util.Scanner(System.in).nextInt();
            int sum = number1 + number2;
            System.out.println("Sum of both number: " + sum);

            System.out.print("Do you want to continue? (y/n): ");
            choice = new java.util.Scanner(System.in).next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
