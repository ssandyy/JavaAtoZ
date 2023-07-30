public class AtoZPatternQ19 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ch);
                ch++;
            }
            if (i < 4) {
                System.out.println();
            }
        }
        System.out.print(ch++);
    }
}
