public class Clone implements Cloneable {
    static int i=10;
    static int j=20;
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Value of 'i': "+i+ " "+"Value of 'j': "+j);

        Clone c1 = new Clone();
        Clone c2 = (Clone) c1.clone();
        i=100;
        j=200;
        System.out.println("Value of 'i' before cloning: "+ i+ " "+"Value of 'j' before cloning : "+ j);

    }
}