public class Age {
    public static void main(String[] args) {
        int person1, person2, person3;

        System.out.println("Enter person 1 age :");
        person1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter person 2 age :");
        person2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter person 3 age :");
        person3 = new java.util.Scanner(System.in).nextInt();

        if(person1 > person2 && person1>person3){
            System.out.println("person 1 is Oldest..!");
        }else if(person2 > person1 && person2>person3){
            System.out.println("person 2 is Oldest..!");
        }else{
            System.out.println("person 3 is Oldest..!");
        }
        
        if(person1 < person2 && person1<person3){
            System.out.println("person 1 is Youngest..!");
        }else if(person2 < person1 && person2<person3){
            System.out.println("person 2 is Youngest..!");
        }else{
            System.out.println("person 3 is Youngest..!");
        }
    }
}
