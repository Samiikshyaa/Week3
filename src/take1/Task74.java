package take1;

import java.util.*;

public class Task74 {
    public static void main(String[] args) {
//      74.  Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Apple");
        hmap.put(2, "Banana");
        hmap.put(5, "Elephant");
        hmap.put(3, "Cat");
        hmap.put(4, "Dog");

        for (int key : hmap.keySet()) {
            System.out.println(key + ": " + hmap.get(key));
        }

//        75. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("The size of the map created is: " + hmap.size());


//        76. Write a Java program to copy all the mappings from the specified map to another map.
        HashMap<Integer, String> hmapCopy = new HashMap<>();
        hmapCopy.putAll(hmap);
        System.out.println("The copy of the hashmap using putall: " + hmapCopy);

//       77. Write a Java program to remove all of the mappings from a map.
        hmapCopy.clear();
        System.out.println("The map after removing all the mappings from a map. " + hmapCopy);

//        78. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("Is the map empty? " + hmapCopy.isEmpty());

//        79. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> hmapShallowCopy = new HashMap<>(hmap);
        System.out.println("The shallow copy of the hash map: " + hmapShallowCopy);

//       80. Write a Java program to test if a map contains a mapping for the specified key.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        if (hmapShallowCopy.containsKey(key)) {
            System.out.println("The map contains " + key + " and its value is: " + hmapShallowCopy.get(key));
        } else {

            System.out.println("The map does not contain " + key + " key.");
        }

//       81. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("Enter the value to search: ");
        String value = sc.next();
        for (Map.Entry<Integer, String> entry : hmapShallowCopy.entrySet()) {
            if (entry.getValue().equals(value)) {
                System.out.println("The map contains the value: " + value + " and its key is: " + entry.getKey());
            }
        }

//      82.  Write a Java program to create a set view of the mappings contained in a map.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Mellow");
        map.put(3, "Jello");
        map.put(4, "Yellow");
        map.put(5, "Kello");

        Set<Map.Entry<Integer, String>> mapSet = new HashSet<>();
        for (Map.Entry<Integer, String> mapentry : map.entrySet()) {
            mapSet.add(mapentry);
        }
        System.out.println("The set view is: " + mapSet);

//       83. Write a Java program to get the value of a specified key in a map.
        System.out.println("Enter the key: ");
        int key2 = sc.nextInt();
        System.out.println("The value of the " + key2 + " is: " + map.get(key2));

//       84. Write a Java program to get a set view of the keys contained in this map.
        Set<Integer> setview = new HashSet<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            setview.add(entry.getKey());
        }
        System.out.println(setview);

//      85. Write a Java program to get a collection view of the values contained in this map.
        Collection<String> values = map.values();
        System.out.println(values);

    }
}
