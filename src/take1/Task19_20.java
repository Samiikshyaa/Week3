package take1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task19_20 {
    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(2);
        numlist.add(4);
        numlist.add(6);
        numlist.add(9);
        System.out.println(numlist);

        numlist.add(3,4);
        System.out.println(numlist);

        List<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr);

        numlist.addAll(3,arr);
        System.out.println(numlist);

    }
}
