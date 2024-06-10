package take1;

import java.util.LinkedList;

public class Task15 {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Kevin");
        linkedlist.add("Bob");
        linkedlist.add("John");
        linkedlist.addFirst("Sawmikshya");
        linkedlist.addLast("Hello");
//        linkedlist.offerLast("Last");
        linkedlist.add("World");

        System.out.println(linkedlist.indexOf("Hello"));
        System.out.println(linkedlist);
    }
}
