package take1;

import java.util.*;

public class EmptyOnly {
    public static void main(String[] args) {
        List<String> nlist = new ArrayList<>();
        nlist.add("Sanji");
        nlist.add("zoro");
        nlist.add("Luffy");
        nlist.add("Nami");
        System.out.println("The list is: "+nlist);
        nlist.clear();
        System.out.println("The list is: "+nlist);

        Set<String> nset = new HashSet<>();
        nset.add("Samikshya");
        nset.add("Utsav");
        nset.add("Pattu");
        nset.add("Suyog");
        System.out.println("The set is: "+nset);
        nset.clear();
        System.out.println("The set is: "+nset);

        Map<Integer, String> nmap = new HashMap<>();
        nmap.put(1,"Apple");
        nmap.put(2,"Banana");
        nmap.put(3,"Cat");
        nmap.put(4,"Dog");
        System.out.println("The map is: "+nmap);
        nmap.clear();
        System.out.println("The map is: "+nmap);
    }
}
