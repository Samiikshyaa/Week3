package take1;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
//        Write a program which takes salary input from the user and calculates the tax amount .The amount is taken as below
//        Up to Npr 500,000 annually - 1%
//                Over Npr 500000 up to 700000 - 10%
//                Over Npr 700000 up to 1,000000 - 20%
//                Over npr 1000000 up to 2000000 - 30%
//                Over npr 2000000 up to 5000000 - 36%
//                Over 5000000 - 39%

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        double tax = 0;
        double percent = 0.0;
        if(salary<500000){
            percent = 1/100.0;
        } else if (salary>=500000 && salary<700000) {
            percent = 10/100.0;
        }else if (salary>=700000 && salary<1000000) {
            percent = 20/100.0;
        }else if (salary>=1000000 && salary<2000000) {
            percent = 30/100.0;
        }else if (salary>=2000000 && salary<5000000) {
            percent = 36/100.0;
        }else if (salary>=5000000) {
            percent = 39/100.0;
        }
        tax = percent * salary;
        System.out.println("The tax amount is: "+tax);
    }
}
