package take1;

import java.util.LinkedList;

public class Task22 {
    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(2);
        numlist.add(4);
        numlist.add(6);
        numlist.add(9);

        for (int n:numlist) {
            System.out.println(n+" = "+ numlist.indexOf(n));
        }
    }
}
