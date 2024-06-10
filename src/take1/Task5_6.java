package take1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_6 {
    public static void main(String[] args) {
        List<String> slist = new ArrayList<>(){{add("Samikshya"); add("Timalsina"); add("Hello"); add("LALALAL");}};
        slist.remove(2);
        System.out.println(slist);
        System.out.println("Enter the index to find the string from the list: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(slist.get(sc.nextInt()));

    }
}
