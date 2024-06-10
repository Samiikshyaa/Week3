package take1;

import java.util.LinkedList;

public class Task17 {
    public static void main(String[] args) {
        LinkedList<Integer> numlinked = new LinkedList<>();
        numlinked.add(2);
        numlinked.add(4);
        numlinked.add(2);
        numlinked.add(8);
        numlinked.add(0);

        System.out.println("The first occurence of the element: "+numlinked.indexOf(2));
        int index = 0;
        for (int i = 0; i< numlinked.size(); i++){
            if (numlinked.get(i) == 2){
                index = i;
            }
        }
        System.out.println("The last occurence of the element: "+index);
    }
}
