package take1;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> nlist1 = new ArrayList<>();
        nlist1.add(2);
        nlist1.add(3);
        nlist1.add(5);

        List<Integer> nlist2 = new ArrayList<>();
        nlist2.add(6);
        nlist2.add(7);
        nlist2.add(8);

        nlist1.addAll(nlist2);
        System.out.println(nlist1);
    }
}
