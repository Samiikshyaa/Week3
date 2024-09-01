package take1;

import java.util.LinkedList;
import java.util.List;

public class Task26 {
//    Write a Java program to clone an linked list to another linked list.
    public static void main(String[] args) {
        LinkedList<Integer> numlist1 = new LinkedList<>();
        numlist1.add(20);
        numlist1.add(30);
        numlist1.add(60);
        numlist1.add(70);
        numlist1.add(90);
        System.out.println("The original list is: "+numlist1);

        LinkedList<Integer> newlist = new LinkedList<>();
        for (int i = 0; i < numlist1.size(); i++) {
            newlist.add(numlist1.get(i));
        }

        System.out.println("This is the new list after cloning: "+newlist);

        //If the built-in method is used

        LinkedList<Integer> builtin = (LinkedList<Integer>) numlist1.clone();
        System.out.println("By using built in method: "+builtin);

        List<Integer> newList = new LinkedList<>();
        newList = (LinkedList<Integer>)numlist1.clone();
        System.out.println(newList);
    }
}
