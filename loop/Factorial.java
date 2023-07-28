public class Factorial {
    public static void main(String[] args) {
        int fact = 1, number;
        System.out.print("Enter positive number to find Factorial: ");
        number = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
