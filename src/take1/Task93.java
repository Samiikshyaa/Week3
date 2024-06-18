package take1;

import java.util.*;

public class Task93 {
    //      93.  Write a Java program to sort keys in Treemap by using comparator
    public static void main(String[] args) {
        Map<Integer, String> names = new LinkedHashMap<>((p1, p2) -> (Integer.compare(p1,p2)));
        names.put(2,"Luffy");
        names.put(1,"Zoro");
        names.put(4,"Nami");
        names.put(3,"Robin");

        names.forEach((key,value) -> System.out.println(key+" = "+value));

    }

}

