package take1;

import java.util.*;

public class ReverseList3 {
    public static void main(String[] args) {
        List<String> slist = new ArrayList<>();
        slist.add("Samikshya");
        slist.add("Timalsina");
        slist.add("Khulz@simsem");
        System.out.println("The List is "+slist);

        System.out.println("The reverse of the list is: ");
        for (int i = slist.size()-1; i >=0 ; i--) {
            System.out.println(slist.get(i));
        }
        //sout using the predefined method.
        Collections.reverse(slist);
        System.out.println(slist);

//        Iterator<String> iterator = slist.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
