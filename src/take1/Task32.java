package take1;

import java.util.LinkedList;

public class Task32 {
    
//    Write a Java program to compare two linked lists.
    public static void main(String[] args) {
        LinkedList<Integer> nlist1 = new LinkedList<>();
        nlist1.add(20);
        nlist1.add(22);
        nlist1.add(27);
        nlist1.add(90);
        nlist1.add(43);
        nlist1.add(40);

        LinkedList<Integer> nlist2 = new LinkedList<>();
        nlist2.add(20);
        nlist2.add(22);
        nlist2.add(40);
        nlist2.add(27);
        nlist2.add(90);
        nlist2.add(43);


        System.out.println("Comparison: "+nlist1.equals(nlist2));
    }
}
