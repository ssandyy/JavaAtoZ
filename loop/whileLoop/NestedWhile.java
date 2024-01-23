package loop.whileLoop;

public class NestedWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i<5) {
            System.out.println("Outer loop: " + i);
            int j=1;
            while (j<3) {
                System.out.println("Inner loop: " + j);
                j++;
                
            }
        i++;
        }
    }
}
