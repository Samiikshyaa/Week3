package take1;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<String> slist = new ArrayList<>();
        slist.add("Samikshya");
        slist.add("Timalsina");
        slist.add("Hello");

        System.out.println(slist);
        slist.removeAll(slist);
        System.out.println(slist);
    }
}
