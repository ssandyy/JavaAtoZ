package Arrays;

public class MathRandom {
    public static void main(String[] args) {
        int num[][] = new int[4][4];

        //int random = (int)(Math.random() *11);       // as random is a double value, we need to convert it into an int value
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int)(Math.random() *11);   // as random is a double value, we need to convert it into an int value
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
