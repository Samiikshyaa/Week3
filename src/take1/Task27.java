package take1;

import java.util.*;

public class Task27 {
//    Write a Java program to remove and return the first element of a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(200);
        numlist.add(201);
        numlist.add(205);
        numlist.add(208);
        numlist.add(300);
        System.out.println("The linked list before removing: "+numlist);

        System.out.println("The removed first element of the linked list is: "+ numlist.remove(0));
        System.out.println("The linked list after removing: "+numlist);


        Integer[] array = numlist.toArray(numlist.toArray(new Integer[0]));//to array
        System.out.println(Arrays.toString(array));
//        ArrayList<Integer> variant = (ArrayList<Integer>)numlist.clone(); //cloning

        ArrayList<Integer> newList = new ArrayList<>(numlist); //converting into arraylist
        Set<Integer> newSet = new TreeSet<>(numlist);
    }
}
