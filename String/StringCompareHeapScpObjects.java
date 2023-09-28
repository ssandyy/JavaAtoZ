package String;

public class StringCompareHeapScpObjects { // Scp -> String constant pool
    public static void main(String... args) {
        String s1 = new String("you can not change me");
        String s2 = new String("you can not change me");
        System.out.println(s1==s2);
        String s3 = "you can not change me";
        System.out.println(s1==s3);
        String s4 = "you can not change me";
        System.out.println(s3==s4);
    }
}
