package take1;

import java.util.LinkedList;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        LinkedList<Integer> numlinked = new LinkedList<>();
        numlinked.add(2);
        numlinked.add(4);
        numlinked.add(6);
        numlinked.add(8);
        numlinked.add(0);

        for (int n: numlinked) {
            System.out.println(n);
        }
    }
}
