// package pattern.patternlevel2;

public class ReverseTriangleQ35 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
