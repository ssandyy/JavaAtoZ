public class ReverseNumber {

    public static void main(String[] args) {
        int number, digit, reverse = 0;

        System.out.println("Enter the number to print reverse..!");
        number = new java.util.Scanner(System.in).nextInt();

        while (number != 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.print("Reverse number of " + number + "is " + reverse);
    }

}
