package loop;

public class TernaryOperator {
    public static void main(String[] args) {
        
        int a = 11;
        String result;

        // if(a%2==0)
        //     result="Even";
        // else
        //     result="Odd";

        //Using Ternary Operator  -->      ?  : 

        result = a%2==0 ? "Even" : "Odd";
        
        System.out.println(result);
    }
}
