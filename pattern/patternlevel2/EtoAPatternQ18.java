public class EtoAPatternQ18 {
    static char ch = 'A';

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print((char) (ch + j));
            }
            System.out.println();
        }
    }
}
