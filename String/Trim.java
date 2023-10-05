package String;

public class Trim {
    public static void main(String[] args) {
        System.out.println("this is trim class");
        // trim() is act only on first or last position not in middle of string

        String name = "Sandeep Kumar Yadav ";
        String subjects = "Maths Science SST English Hindi";
        System.out.println("Length of String name without using trim(): "+name.length());
        System.out.println("Length of String name using trim(): "+name.trim().length());
        System.out.println("Length of String Subject without using trim(): "+subjects.length());
        System.out.println("Length of String Subject using trim(): "+subjects.trim().length());
    }
}
