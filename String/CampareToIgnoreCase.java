package String;
// here comparasion is happening accordance of ascii code A=65 and a=97
public class CampareToIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Strings are Immutable";
        String str2 = "strings are immutable";
        String str3 = "Integers are not immutable";

        int result1 = str1.compareTo(str2);
        System.out.println("compareTo = "+result1);  // here comparasion is happening accordance of ascii code of first letter(S=83 - s=115 = O/P -32)

        int result2 =str1.compareToIgnoreCase(str2);
        System.out.println("compareToIgnoreCase= "+result2); // here comparasion orrorce as per ascii code but ignore upper/lower case.(83 -83 = 0 O/P)

        int result3 = str3.compareToIgnoreCase(str1);
        System.out.println(result3);   //asscii code (I=73 - S=83 = -10)

    }
}
