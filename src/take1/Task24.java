package take1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task24 {
//    Write a Java program to shuffle the elements in a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(2);
        numlist.add(4);
        numlist.add(3);
        numlist.add(8);

        System.out.println("The original linked list is: "+numlist);

        Random rand = new Random();
        for (int i = 0; i < numlist.size(); i++) {
            int r = rand.nextInt(numlist.size());
            System.out.println(r);
            int temp = numlist.get(i);
            numlist.set(i, numlist.get(r));
            numlist.set(r, temp);
        }
        System.out.println("The list after shuffling is: "+numlist);
    }
}
