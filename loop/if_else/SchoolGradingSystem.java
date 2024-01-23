package loop.if_else;
public class SchoolGradingSystem {
    public static void main(String[] args) {
        int marks;

        System.out.println("Enter your Mark to know your Grade: ");
        marks= new java.util.Scanner(System.in).nextInt();

        if(marks<25){
            System.out.println("your Corresponding grade is F");
        }else if(marks>=25 && marks<45){
            System.out.println("your correxponding Grade is E");
        }else if(marks>=45 && marks<50){
            System.out.println("your correxponding Grade is D");
        }else if(marks>=50 && marks<60){
            System.out.println("your correxponding Grade is C");
        }else if(marks>=60 && marks<80){
            System.out.println("your correxponding Grade is B");
        }else if(marks>=80 && marks<=100){
            System.out.println("your correxponding Grade is A");
        }else{
            System.out.println("Please enter valid Marks..!!");
        }

    }
}
