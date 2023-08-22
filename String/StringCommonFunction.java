package String;

public class StringCommonFunction {
    String s = "  hello  ";
    char[] ch =s.toCharArray();
    byte[] b = s.getBytes();
    String s1 =s.toUpperCase();
    String s2 = s.toLowerCase();
    String s4 = s.concat(" ssandyy");
    String s3 =s.trim();
    String s6 = s.concat(" ssandyy");
    boolean s5 = s.contains("h");
    String s7 = String.format(s);

    String s8 = s.replace('h','s');
    String[] s9 = s.split(",", 2);


    public static void main(String[] args) {
        StringCommonFunction obj = new StringCommonFunction();
        obj.charAt(2);

        System.out.print(obj.s1+" this is 's1' \n"+ obj.s2+" this is 's2' \n"+ obj.s3+" this is 's3' \n");
        System.out.println("Value of s4 : "+obj.s4);
        System.out.println("Value of s5 : "+obj.s5);
        System.out.println("s7 value with format(): " +obj.s7);
        System.out.println("Value of s8 replace(): "+obj.s8);
        System.out.println("Value of s9 split(): "+obj.s9);
        System.out.println("Getting bytes of String s: "+obj.b);
        StringBuilder str = new StringBuilder();
        System.out.println("Value of 's' after append(): "+str.append(obj.s3).append(" ssandyy, How are you?"));

    }

    char charAt(int index) {
        String s1 = "hello";
        for (int i=0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.print(ch);
        }
        return 0;
    }
}
