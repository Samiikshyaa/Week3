package take1;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> nlist = new ArrayList<>(){{add(2);add(4);add(0);add(6);}};
        Collections.sort(nlist);
        System.out.println("The sorted list is: "+nlist);
    }
}
