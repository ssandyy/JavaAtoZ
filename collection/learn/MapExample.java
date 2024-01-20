package collection.learn;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sandeep", 12);
        map.put("Dilip", 13);
        map.put("Tulshi", 14);
        map.put("Gauri", 15);
        map.put("Laxmi", 16);
        map.put("Nikita", 17);
        map.put("Dilip", 20);  // Duplicate not allowed in Map

        System.out.println(map);
        System.out.println(map.get("Sandeep"));


        //Traverse Map using for-each methods..
        map.forEach((e1,e2) -> System.out.println(e1 + " ==> " + e2));// Using lambda expression
    }
}
