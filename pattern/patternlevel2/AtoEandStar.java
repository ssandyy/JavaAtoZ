public class AtoEandStar {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (ch + j));
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
