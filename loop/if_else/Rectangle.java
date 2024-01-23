package loop.if_else;
class Rectangle{
    public static void main(String[] args) {
        int length, breadth;
        System.out.println("Enter the length of Rectangle: ");
        length=new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        breadth=new java.util.Scanner(System.in).nextInt();

        if (length == breadth){
            System.out.println("its a Square..!");
        }else{
            System.out.println("its a Rectangle..!");
        }
    }
}