package take1;

import java.util.LinkedList;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        LinkedList<Integer> numlist = new LinkedList<>();
        numlist.add(9);
        numlist.add(2);
        numlist.add(4);
        numlist.add(6);
        System.out.println("Elements before swapping: "+ numlist);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the indices of elements to swap: ");
        int f = sc.nextInt();
        int l = sc.nextInt();


        int temp = numlist.get(f);
        numlist.set(f,numlist.get(l));
        numlist.set(l,temp);

        System.out.println(numlist);



    }
}
