package take1;

import java.util.*;

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
        vegetables.put(550, "Lemons");
        vegetables.put(250, "Cucumber");
        Map<Integer, String> boughtvegetables = new TreeMap<>(vegetables);
        System.out.println(boughtvegetables);

//      89.  Write a Java program to search a key in a Tree Map.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to search: ");
        int key = sc.nextInt();
        int count = 0;
        for (int k : vegetables.keySet()) {
            if (key == k) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The key " + key + " does not exist.");
        } else {
            System.out.println("The value of the key " + key + " is: " + vegetables.get(key));
        }

//      90. Write a Java program to search a value in a Tree Map.
        System.out.println("Enter the value you want to search: ");
        String value = sc.next();
        count = 0;
        for (Map.Entry<Integer, String> entry : vegetables.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value)) {
                System.out.println("The key of the value " + value + " is: " + entry.getKey());
                break;
            }
        }


//      91.  Write a Java program to get all keys from a given Tree Map.
        for (int k : treemap.keySet()) {
            System.out.println(k + " = " + treemap.get(k));
        }

//      92.  Write a Java program to delete all elements from a given Tree Map.
        treemap.clear();
        System.out.println(treemap);

//      93.  Write a Java program to sort keys in Treemap by using comparator


    }
}
