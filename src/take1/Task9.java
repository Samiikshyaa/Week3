package take1;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> slist = new ArrayList<>();
        slist.add(2);
        slist.add(3);
        slist.add(9);
        slist.add(10);
        slist.add(6);

        System.out.println(slist.subList(1,4));
    }
}
