package take1;

import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String str = sc.next();
        int startcount = 0, endcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                startcount++;
            }else if (str.charAt(i) == ')') {
                endcount++;
            }
        }
        if(startcount==0 || endcount==0){
            System.out.println("There is no paranthesis.");
        }else if(startcount == endcount){
            System.out.println("The paranthesis are balanced");
        }else {
            System.out.println("The paranthesis is not balanced.");
        }
    }
}
