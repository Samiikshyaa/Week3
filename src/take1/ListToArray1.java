package take1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray1 {
    public static void main(String[] args) {
        List<String> namelist = new ArrayList<>(){{add("lalala"); add("Samikshya");add("Timalsina");add("lalala");}};
        System.out.println("The arrayList is: "+namelist);
        String[] array = namelist.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
        System.out.println("ALTERNATIVE=================");
        String[] nlist = new String[namelist.size()];
        for (int i = 0; i < namelist.size(); i++) {
            nlist[i] = namelist.get(i);
        }
        System.out.println("The array is : "+Arrays.toString(nlist));
    }
}
