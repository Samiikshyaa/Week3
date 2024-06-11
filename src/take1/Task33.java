package take1;

import java.util.LinkedList;

public class Task33 {
//    Write a Java program to test an linked list is empty or not.
    public static void main(String[] args) {
        LinkedList<Integer> nlist = new LinkedList<>();
        nlist.add(20);
        nlist.add(22);
        nlist.add(40);
        nlist.add(27);
        nlist.add(90);
        nlist.add(43);

        LinkedList<Integer> nlist1 = new LinkedList<>();

        System.out.println("The list is empty:"+nlist.isEmpty());
        System.out.println("The list1 is empty:"+nlist1.isEmpty());

    }
}
