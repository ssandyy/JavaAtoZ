import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}