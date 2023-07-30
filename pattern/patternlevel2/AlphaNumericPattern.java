public class AlphaNumericPattern {
    public static void main(String[] args) {
        char ch = 'A';

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 != 0) {
                    System.out.print(j);
                } else {
                    System.out.print((char) (ch + (j - 1)));
                }
            }
            System.out.println();
        }
    }
}
