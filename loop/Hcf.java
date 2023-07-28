
public class Hcf {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int num1 = new java.util.Scanner(System.in).nextInt();

        System.out.print("Enter the second number: ");
        int num2 = new java.util.Scanner(System.in).nextInt();

        int hcf = findHCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findHCF(b, a % b);
        }
    }
}
