package take1;

import java.util.LinkedList;
import java.util.Scanner;

public class Task30 {
//    Write a Java program to check if a particular element exists in a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> nlist = new LinkedList<>();
        nlist.add(20);
        nlist.add(22);
        nlist.add(27);
        nlist.add(90);
        nlist.add(43);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the particular element: ");
        int num = sc.nextInt();

        if(nlist.contains(num)){
            System.out.println("The list contains "+num+" in the list.");
        }else {
            System.out.println("The list doesn\'t contain "+num+" in the list.");
        }

    }
}
