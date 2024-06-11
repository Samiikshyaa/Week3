package take1;

import java.util.LinkedList;
import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
//        Write a Java program to replace an element in a linked list.
        LinkedList<Integer> nlist = new LinkedList<>();
        nlist.add(20);
        nlist.add(22);
        nlist.add(40);
        nlist.add(40);
        nlist.add(90);
        nlist.add(43);
        System.out.println(nlist);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to replace: ");
        int element = sc.nextInt();
        int index = nlist.indexOf(element);
        if (index == -1){
            System.out.println("The number doesn't exist in the list. ");
        }else{
            System.out.println("Enter the element to replace with: ");
            int replacewith = sc.nextInt();
            nlist.set(index,replacewith);
        }
        System.out.println("New List Is: "+nlist);
    }
}
