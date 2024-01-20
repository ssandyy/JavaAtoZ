package generic;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sandeep");   
        list.add("Dilip");
        //list.add(99);// not allowed due to your generic type as it provides type safety

        List withoutgen = new ArrayList();
        withoutgen.add("Sandeep");
        withoutgen.add(88);
        withoutgen.add(78.55);
        System.out.println(withoutgen);
    }
}
