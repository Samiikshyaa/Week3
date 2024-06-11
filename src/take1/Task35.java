package take1;

import java.util.*;

public class Task35 {
    public static void main(String[] args) {
//      Write a Java program to append the specified element to the end of a hash set.

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(20);
        hs.add(30);
        hs.add(50);
        hs.add(40);
        hs.add(80);
        System.out.println(hs);
        hs.add(70);



        System.out.println("New hash set is: "+hs);
    }
}
