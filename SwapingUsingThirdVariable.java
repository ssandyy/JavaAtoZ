import java.util.Scanner;

public class SwapingUsingThirdVariable {
    public static void main(String[] args) {
        int x,y,z;

        Scanner no1 = new Scanner(System.in);
        System.out.print("Enter you value of first variable x: ");
        x=no1.nextInt();

        Scanner no2 = new Scanner(System.in);
        System.err.print("Enter value of second variable y: "); // this will display in red color as use of 'err' instead of 'out'
        y=no2.nextInt();

        System.out.println("Before Swapping Value of x:"+x+" and  y:"+y);
        z=x;
        x=y;
        y=z;

        System.out.println("After Swapping Value of x:"+x+ "and  y:"+y);

    }
}
