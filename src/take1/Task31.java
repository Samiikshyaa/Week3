package take1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task31 {
    //    Write a Java program to convert a linked list to array list.

    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(20);
        numlist.add(22);
        numlist.add(89);
        numlist.add(90);
        numlist.add(34);
        System.out.println("The linkedList is: "+numlist);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int n: numlist){
            arrayList.add(n);
        }
        System.out.println("The arrayList is: "+arrayList);
    }
}
