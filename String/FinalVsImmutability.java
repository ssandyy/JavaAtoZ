package String;

public class FinalVsImmutability {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Sandeep");
        System.out.println(sb); // Sandeep
        sb.append(" Kumar");
        System.out.println(sb); //Sandeep Kumar
        /*
        sb=new StringBuffer("Yadav");
        System.out.println(sb); // cannot assign a value to final variable sb
       */
    String s = "Good";
    //s.append("morning"); // cannot find symbol method append(java.lang.String)
    s.concat("morning");
        System.out.println(s); // good as string object is immutable
        System.out.println(s.concat(" morning")); // Good Morning as it created anynmus varibale but still s vale not changed
        

    }
}
