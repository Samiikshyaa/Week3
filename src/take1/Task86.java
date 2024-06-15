package take1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task86 {
    public static void main(String[] args) {
//      86.  Write a Java program to associate the specified value with the specified key in a Tree Map.
        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(1, "Banana");
        treemap.put(2, "Apple");
        treemap.put(4, "Donuts");
        treemap.put(3, "Chocolate");
        System.out.println(treemap);

//      87.  Write a Java program to copy a Tree Map content to another Tree Map.
        Map<Integer, String> vegetables = new TreeMap<>();
        vegetables.put(300, "Cauliflower");
        vegetables.put(100, "Cabbage");
        vegetables.put(50, "Lemon");
        vegetables.put(250, "Cucumber");
        Map<Integer, String> boughtvegetables = new TreeMap<>(vegetables);
        System.out.println(boughtvegetables);




    }
}
