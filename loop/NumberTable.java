class NumberTable {
    public static void main(String[] args) {
        int number;
        int mult;
        System.out.print("Enter number to print Table: ");
        number = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            mult = number * i;
            System.out.println(mult);
        }
    }
}