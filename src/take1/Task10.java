package take1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> slist1 = new ArrayList<>();
        slist1.add("Samikshya");
        slist1.add("Timalsina");
        slist1.add("Hello");
        slist1.add("lalala");

        List<String> slist2 = new ArrayList<>();
        slist2.add("Samikshya");
        slist2.add("Timalsina");
        slist2.add("Hello");
        slist2.add("apple");
//        slist2.add("apple");

        System.out.println(slist1.equals(slist2));


    }
}
