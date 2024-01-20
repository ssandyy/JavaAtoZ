
package collection.learn;

import java.util.*;


public class StartCode {

    public static void main(String[] args) {
        System.out.println("Welcome to collection framework..!");
        

        //Type Safe Collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Sandeep");
        names.add("Dilip");
        //names.add(89);  // error as this is not String type data
        names.add("Tulshi");
        names.add("Gauri");
        names.add("Laxmi");
        names.add("Nikita");
        names.add("Sandeep");   // type safe collection allows duplicate elements
        names.add("bh1");
        System.out.println(names);
        System.out.println(names.get(2));


        //Un-type Safe Collection
        LinkedList list = new LinkedList();
        list.add("Sandeep");
        list.add("Dilip");
        list.add(99);
        list.add(99.99);
        list.add(true);
        System.out.println(list);


        names.remove("bh1");
        System.out.println(names);

        // Check available item
        System.out.println(names.contains("Sandeep"));
        System.out.println(names.contains("Sandeep kumar"));

        //replace specific sort
        Collections.sort(names);
        System.out.println(names);

        // add all
        Vector<String> v = new Vector<>();
        v.addAll(names);
        System.out.println("vector: "+v);





        System.out.println("\n--------------------  Set -----------------------\n");
        HashSet<Double> hset = new HashSet<>();
        // hset.addAll(list);
        // System.out.println(hset);

        hset.add(12.45);
        hset.add(74.44);
        hset.add(11.45);
        hset.add(72.44);
        System.out.println(hset);

        //TreeSet is sorted in nature
        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(hset);
        System.out.println(tset);




       





    }
}

