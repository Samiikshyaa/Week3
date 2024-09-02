package take1;

import java.util.*;

public class Task94 {
    public static void main(String[] args) {
//        Write a Java program to get the first (lowest)
//        key and the last (highest) key currently in a map.

        Map<Integer, String> map = new HashMap<>();
        map.put(21, "Samikshya");
        map.put(20, "Ram");
        map.put(17, "Shyam");
        map.put(25, "Prateek");

        List<Integer> keys = new ArrayList<>(map.keySet());


        System.out.println(keys);
        keys.sort((k1,k2)-> k1.compareTo(k2));
        System.out.println(keys);

        System.out.println("Lowest key is: "+ keys.get(0)+ "="+ map.get(keys.get(0)));
        System.out.println("Highest key is: "+keys.get(keys.size()-1)+ "="+map.get(keys.get(keys.size()-1)));

    }
}
