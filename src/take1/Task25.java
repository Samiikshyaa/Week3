package take1;

import java.util.LinkedList;

public class Task25 {
    public static void main(String[] args) {
//        Write a Java program to join two linked lists.
        LinkedList<Integer> numlist1 = new LinkedList<>();
        numlist1.add(20);
        numlist1.add(30);
        numlist1.add(60);
        numlist1.add(70);
        numlist1.add(90);
        System.out.println("The first list is: "+numlist1);

        LinkedList<Integer> numlist2 = new LinkedList<>();
        numlist2.add(100);
        numlist2.add(101);
        numlist2.add(105);
        numlist2.add(108);
        numlist2.add(201);
        numlist2.add(2001);
        System.out.println("The second list is: "+numlist2);

        LinkedList<Integer> newlist = new LinkedList<>();
        for (int i = 0; i < numlist1.size() ; i++) {
            newlist.add(numlist1.get(i));
        }
        for (int i = 0; i < numlist2.size() ; i++) {
            newlist.add(numlist2.get(i));
        }
        System.out.println("The added new list is: "+newlist);

        numlist1.addAll(numlist1.size(),numlist2);
        System.out.println("The result after joining the two linked lists is: "+numlist1);

    }
}
