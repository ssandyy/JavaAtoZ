package loop.if_else;
public class CompanyBonus {
    public static void main(String[] args) {
        float salary;
        int year;
        float bonus;
        float netBonus;

        System.out.println("Enter years of experience in this company: ");
        year = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter your salary: ");
        salary = new java.util.Scanner(System.in).nextFloat();

        if(year>=5){
            bonus=(salary*5)/100;
            netBonus = salary+bonus;
            System.out.println("your increment amount is : "+bonus);
            System.out.println("your net salary after bonus is :"+netBonus);
        }
    }
}
