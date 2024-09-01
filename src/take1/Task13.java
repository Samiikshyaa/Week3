package take1;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<Integer> nlist = new ArrayList<>(10);
        nlist.add(20);
        nlist.add(30);
        nlist.add(50);
        nlist.add(40);

        nlist.trimToSize();

        System.out.println(nlist);



        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Print the initial capacity (not directly accessible, but can infer by creating a large list and trimming)
        System.out.println("Initial size: " + list.size());

        // To check the initial capacity indirectly, create a large list and trim it
        ArrayList<String> largeList = new ArrayList<>(100); // create with initial capacity of 100
        for (int i = 0; i < 100; i++) {
            largeList.add("Element " + i);
        }
        System.out.println("Large list size before trim: " + largeList.size());

        // Trim the capacity to the current size
        largeList.trimToSize();

        // The actual capacity is not directly accessible, but we can see the size
        System.out.println("Large list size after trim: " + largeList.size());
    }
}

