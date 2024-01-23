package loop.if_else;

public class Absolute {
    public static void main(String[] args) {
        float value;
        float value1;
        System.out.println("Enter the value to find absolute : ");
        value = new java.util.Scanner(System.in).nextFloat();

        if (value <0){
            value1 = value * (-1);
            System.out.println("Absolute value of "+value+ "is "+value1);
        }

    }
}
