package take1;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] temp = new int[arr.length];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to rotate the array: ");
        int n = sc.nextInt();

        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < arr.length; i++) {
                if(i < arr.length-1){
                    temp[i+1] = arr[i];
                }else{
                    temp[0] = arr[arr.length-1];
                }
            }
            arr = temp.clone();
            System.out.println(k+" round = "+Arrays.toString(arr));
        }
    }
}
