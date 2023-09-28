import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int x,y;

        Scanner no1 = new Scanner(System.in);
        System.out.print("Enter you value of first variable x: ");
        x=no1.nextInt();

        Scanner no2 = new Scanner(System.in);
        System.err.print("Enter value of second variable y: ");
        y=no2.nextInt();

        System.out.println("Before Swapping Value of x:"+x+" and  y:"+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping Value of x:"+x+ "and  y:"+y);

    }
}
