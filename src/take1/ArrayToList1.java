package take1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList1 {
    public static void main(String[] args) {
        String[] s = {"Samoikshya","Timalsina","Hello"};
        List<String> slist = new ArrayList<>(Arrays.asList(s));
        System.out.println(slist);


        System.out.println("ALTERNATIVE=================");
        List<String> slist2 = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            slist2.add(s[i]);
        }
        System.out.println(slist2);


    }
}

