package collection.learn;

import java.util.*;

public class TraverseExample {
    public static void main(String[] args) {
        System.out.println("\n------------------- Traverse Example ------------------\n");

        System.out.println("Traversing list side ArayList..!");
        ArrayList<String> names = new ArrayList<>();
        names.add("Sandeep");
        names.add("Dilip");
        names.add("Tulshi");
        names.add("Gauri");
        names.add("Laxmi");
        names.add("Nikita");
        names.add("Sandeep");

        //using for-each loop
        System.out.println("--------1st way of TraverseArrayList-------------- Traversing Using for-each loop..!");;
        for (String str : names) {
            System.out.print(str + " Size: " + str.length()+ "  ");
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());  // Reversed the string
        }
        
        // Using Iterator : Forward Traversal
        System.out.println("\n 2nd way of Traverse------------ ArrayList Traversing Using ITERATOR..! \n");
        Iterator<String> itr = names.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //using Iterator : Backward Travesal using LISTITERATOR
        System.out.println("3rd way of Traverse____________  using Iterator : Backward Travesal using LISTITERATOR ____________");
        ListIterator<String> listItr = names.listIterator(names.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
            
        }

        System.out.println("4th way of Traverse------------------  Enumuration  ----------------------------");
        // using Enumuration (since its belong only to vector class which is legecy so not applicable for anyother classes like Arraylist linklist etc..)
        Vector<String> v = new Vector<>();
        v.add("78");
        v.add("sandeep");
        v.add("dilip");
        System.out.println(v);
        
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
            
        }


        System.out.println("\n 5th way of Traverse___________for-each method __________!\n ");
        names.forEach(sand->{ System.out.println(sand);});      // here we have used lambda expression
    }
    

}
