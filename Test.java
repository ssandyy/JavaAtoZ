public class Test {
    public static void main(String[] args) {
        String name = "SANDEEP_KUMAR_YADAV";
        int k = 0;

        for (int i = 0; i <= (name.length()) && k < name.length(); i++) {
            for (int j = 0; j <= i; j++) {
                // for (int j = 0; j <= i && k < name.length(); j++) {
                if (k < name.length()) {
                    System.out.print(name.charAt(k));
                    k++;
                }
            }
            System.out.println();
            // }
        }
    }
}
