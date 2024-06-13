package take1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        int amount = 500;

        if(salary <= 0) {
            amount = 0;
        }
        int remaining = salary - 100000;

        if(remaining > 0) {
         double  floorData =    remaining/(double)100000;
            System.out.println(floorData);

            System.out.println(Math.ceil(floorData));
        int numberOfLakhs = (int) Math.ceil(floorData);
        amount += numberOfLakhs*5;
        }

        System.out.println(amount);

    }
}
