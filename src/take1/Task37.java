package take1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Task37 {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(67);
        hs.add(70);
        hs.add(74);
        hs.add(79);
        hs.add(7);

        HashSet<String> stringset = new HashSet<>();
//      37. Write a Java program to get the number of elements in a hash set.
        System.out.println("The number of elements in hash set: " + hs.size());

//      38. Write a Java program to empty a hash set.
        hs.clear();
        System.out.println(hs);

//      39. Write a Java program to test if a hash set is empty or not.
        System.out.println(stringset.isEmpty());
        System.out.println(hs.isEmpty());

//      40. Write a Java program to clone a hash set to another hash set.
        HashSet<Integer> h = new HashSet<>();
        h.add(3);
        h.add(67);
        h.add(70);
        h.add(74);
        h.add(79);
        h.add(7);

        HashSet<Integer> cloneset = (HashSet<Integer>) h.clone();
        System.out.println(cloneset);

//      41.  Write a Java program to convert a hash set to an array.
        hs.toArray();

//        for (int i = 0; i<hs.size(); i++) {
//            arr[i] = hs.
//        }
    }
}
