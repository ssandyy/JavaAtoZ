class Greater {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter the first number: ");
        num1=new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter the second number: ");
        num2=new java.util.Scanner(System.in).nextInt();

        if (num1>num2){
            System.out.println("First number is greater then Second Number...!");
        }else{
            System.out.println("Second number is greater then firts Number..!");
        }
    }
}
