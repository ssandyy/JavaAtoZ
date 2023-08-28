package String;

//public static String copyValueOf(char[] data)
//or
//public static String copyValueOf(char[] data, int offset, int count)



public class CopyValueOf {
    public static void main(String[] args) {
        char[] str1 = {'h','e','l','l','o', ' ', 'w','o','r','l','d'};
        String str2 ="";

        str2 = String.copyValueOf(str1);
        System.out.println("Returned Valueof str2 after copy str1: "+str2);  // hello world

        str2 = String.copyValueOf(str1, 2,6);
        System.out.println("Returned value of str2 with specific trim/Range: "+str2); // llo wo
    }
}
