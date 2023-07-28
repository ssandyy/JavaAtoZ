public class PositiveNegativeZero {
    public static void main(String[] args) {

        System.out.print("Enter the number of elements in the set: ");
        int n = new java.util.Scanner(System.in).nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = new java.util.Scanner(System.in).nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
