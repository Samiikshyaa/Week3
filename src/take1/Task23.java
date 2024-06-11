package take1;

import java.util.LinkedList;
import java.util.Scanner;

public class Task23 {
//    Write a Java program to remove a specified element from a linked list.

    public static void main(String[] args) {
        LinkedList<String> nlist = new LinkedList<>();
        nlist.add("Apple");
        nlist.add("Orange");
        nlist.add("Ball");
        nlist.add("Cat");

        System.out.println("The original linked list: "+nlist);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be removed: ");
        String s = sc.next();

        nlist.remove(s);
        System.out.println("The linked list after removing the element: " +s +" is "+nlist);
    }
}
