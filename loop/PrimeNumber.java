public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        int count = 0;
        System.out.println("Enter the number to check its prime or not..!: ");
        number = new java.util.Scanner(System.in).nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                int z = number % i;
                if (z == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("It is a prime no.");

            } else {
                System.out.println("It is not a prome no");
            }
        } else {
            System.out.println("Please enter positive value..!");
        }
    }
}
