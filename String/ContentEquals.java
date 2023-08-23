package String;

public class ContentEquals {


    static void checkup(){
        String str1 = "Good Morning..! ";
        String str2 = " Hello ssandyy..!";
        System.out.println(str1.contentEquals(str2));
    }
//OR

    public static void main(String[] args) {
        ContentEquals.checkup();
//        OR
        String s1 = "Not immutable";
        String s2 = "Strings are immutable";

        StringBuilder s3 = new StringBuilder("Not immutable");

        boolean result = s1.contentEquals(s3);
        System.out.println(result);

        result = s2.contentEquals(s3);
        System.out.println(result);
    }

}
