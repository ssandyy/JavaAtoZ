class ReverseAlphabatesQ16 {
    static char c = 'A';

    public static void main(String... args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print((char) (c + j));
            }
            c++;
            System.out.println();
        }
        System.err.println();
    }
}