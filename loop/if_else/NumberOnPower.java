package loop.if_else;
public class NumberOnPower {
    public static void main(String[] args) {
        int num, pow, result = 1;
        System.out.print("Enter the number: ");
        num = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the power of the number: ");
        pow = new java.util.Scanner(System.in).nextInt();

        if (num >= 1) {
            for (int i = 1; i <= pow; i++) {
                result *= num;
            }
            System.out.println(result);
        } else {
            System.out.println(1);
        }
    }
}
