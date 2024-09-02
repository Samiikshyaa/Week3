package take1;

import java.util.*;

public class Task37_58 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(67);
        hs.add(70);
        hs.add(74);
        hs.add(79);
        hs.add(7);
        HashSet<String> stringset = new HashSet<>();


//      37. Write a Java program to get the number of elements in a hash set.
        System.out.println("The number of elements in hash set: " + hs.size());


//      38. Write a Java program to empty a hash set.
        hs.clear();
        System.out.println(hs);


//      39. Write a Java program to test if a hash set is empty or not.
        System.out.println("Checking Empty: ");
        System.out.println(stringset.isEmpty());
        System.out.println(hs.isEmpty());


//      40. Write a Java program to clone a hash set to another hash set.
        HashSet<Integer> h = new HashSet<>();
        h.add(3);
        h.add(67);
        h.add(70);
        h.add(74);
        h.add(79);
        h.add(7);

        Set<Integer> cloneset = (HashSet<Integer>) h.clone();
        System.out.println(cloneset);


//      41.  Write a Java program to convert a hash set to an array.
        Object[] arr = h.toArray();
        System.out.println("The array is: "+Arrays.toString(arr));



//      42.  Write a Java program to convert a hash set to a tree set.
        Set<Integer> ts =new TreeSet<>(h);
        System.out.println(ts);



//      43.  Write a Java program to convert a hash set to a List/ArrayList.
        List<Integer> al = new ArrayList<>(h);
//        for (int s : h) {
//            al.add(s);
//        }

        System.out.println("THISSSSSS The array list is: "+al);


//      44. Write a Java program to compare two hash set.
        Set<String> h1 = new HashSet<>();
        h1.add("Hello");
        h1.add("Samikshya");
        h1.add("Timalsina");
        h1.add("Lalalala");

        Set<String> h2 = new HashSet<>();
        h2.add("Hello1");
        h2.add("Samikshya");
        h2.add("Timalsina");
        h2.add("Lalalala1");

        System.out.println("The first hashSet is equal to second hashSet:  "+h1.equals(h2));

//      45. Write a Java program to compare two sets and retain elements which are the same on both sets.

        System.out.println("Comparison between two sets:  "+ h1.equals(h2));
        System.out.println("The equal elements are: ");
            for(String s1: h1){
                for(String s2: h2){
                    if (s1.equals(s2)){
                        System.out.println(s1);
                    }
                }
            }
//            Alternative of the retaining
            h1.retainAll(h2);
            System.out.println(h1);



//      46. Write a Java program to remove all of the elements from a hash set.
        HashSet<String> toempty  = new HashSet<>();
        toempty.add("Robin");
        toempty.add("Zoro");
        toempty.add("Corazon");
        System.out.println(toempty);

        toempty.removeAll(toempty);
        System.out.println(toempty);



//      47. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colours = new TreeSet<>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Black");
        System.out.println("The tree set of colours is: "+colours);


//      48. Write a Java program to iterate through all elements in a tree set.
        System.out.println("Iterating the elements in a tree set: ");
        Iterator<String> ite = colours.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

//      49. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(10);
        t1.add(14);
        t1.add(20);
        t1.add(26);

        TreeSet<Integer> t2 = new TreeSet<>();
        t2.add(100);
        t2.add(147);
        t2.add(203);
        t2.add(268);

        t1.addAll(t2);
        System.out.println("Adding all the elements of a specified tree set to another tree set "+t1);


//      50. Write a Java program to create a reverse order view of the elements contained in a given tree set.

//        Ps: Doesnot modify t1
        System.out.println("The reverse order of the tree set is: "+t1.descendingSet());

//      51. Write a Java program to get the first and last elements in a tree set.
        System.out.println("The first element of the treeset is: "+t1.first());
        System.out.println("THE last element of the treeset is: "+t1.last());

//      000. Convert the treeset to array.
        int i = 0;
        int[] treetoarray = new int[t1.size()];
        for (int n : t1){
            treetoarray[i] = n;
            i++;
        }
        System.out.println("The conversion of the TreeSet to Array: "+Arrays.toString(treetoarray));

//      52. Write a Java program to get the number of elements in a tree set.
        System.out.println("Getting the number of elements in a tree set. "+t1.size());

//      53. Write a Java program to compare two tree sets.
        System.out.println("Comparison: "+t1.equals(t2));



    }
}
