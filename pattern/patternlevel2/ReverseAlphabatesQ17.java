public class ReverseAlphabatesQ17 {
    public static void main(String[] args) {
        char ch = 'E';
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }
    }
}
