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
    }
}
