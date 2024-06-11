package take1;

import java.util.LinkedList;

public class Task29 {
    public static void main(String[] args) {
//        Write a Java program to retrieve but does not remove, the last element of a linked list.
        LinkedList<String> names = new LinkedList<>();
        names.add("Bob");
        names.add("Pam");
        names.add("Kevin");
        names.add("John");

        System.out.println(names);
        System.out.println("The last element is: (using get) "+names.get(names.size()-1));
        System.out.println("The last element is: (using peek) "+names.peekLast());
    }
}
