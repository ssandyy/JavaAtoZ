public class SumOfEvenOdd {
    
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the set: ");
        int n = new java.util.Scanner(System.in).nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = new java.util.Scanner(System.in).nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}