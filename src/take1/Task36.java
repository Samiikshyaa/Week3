package take1;

import java.util.HashSet;
import java.util.Iterator;

public class Task36 {
    public static void main(String[] args) {
//        Write a Java program to iterate through all elements in a hash list
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(67);
        hs.add(70);
        hs.add(74);
        hs.add(79);
        hs.add(7);
//        Iterator<Integer> it = hs.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        for(int s: hs){
            System.out.println(s);
        }

    }
}
