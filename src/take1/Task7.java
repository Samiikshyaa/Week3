package take1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        List <Integer> nlist = new ArrayList<>(){{add(2);
                                                  add(3);
                                                  add(4);}};

        System.out.println("Enter the element to find: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(nlist.contains(sc.nextInt()));

    }
}
