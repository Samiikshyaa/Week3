package take1;

import java.util.LinkedList;

public class Task28 {
//    Write a Java program to retrieve but does not remove, the first element of a linked list

    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(200);
        numlist.add(305);
        numlist.add(2010);
        numlist.add(300);

        int retrivedget = numlist.get(0);
        int retrivedpeek = numlist.peekFirst();
        System.out.println("The first element of the linked list is: (using get) "+retrivedget);
        System.out.println("The first element of the linked list is: (using peek) "+retrivedpeek);
    }
}
