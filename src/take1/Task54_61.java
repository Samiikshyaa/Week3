package take1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Task54_61 {
    public static void main(String[] args) {
//      54. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> numtree = new TreeSet<>();
        numtree.add(2);
        numtree.add(6);
        numtree.add(3);
        numtree.add(2);
        numtree.add(10);
        numtree.add(900);
        System.out.println("The num tree created is: "+numtree);

        System.out.println("(without iterator)");
        for(int n : numtree){
            if(n<7) {
                System.out.println(n);
            }
        }

        System.out.println("(with iterator)");
        Iterator<Integer> iter = numtree.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            if (num<7){
                System.out.println(num);
            }
        }

//      55.  Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which is greater than or equal to the given element: ");
        int n = sc.nextInt();
        System.out.println("The element in a tree set which is greater than or equal to "+ n);
        for(int num : numtree){
            if(num>= n){
                System.out.println(num);
                break;
            }
        }
        System.out.println(numtree.ceiling(n));

//      56.  Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("Enter the element which is less than or equal to the given element.: ");
        int  ln= sc.nextInt();
        System.out.println("The element in a tree set which is less than or equal to "+ ln);
        for(int no : numtree){
            if(no <= ln){
                System.out.println(no);
                break;
            }
        }
        System.out.println(numtree.floor(n));

//      57.  Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
        System.out.println("Enter the element which is strictly greater than or equal to the given element : ");
        int sgn = sc.nextInt();
        System.out.println("The element in a tree set which is strictly greater than or equal to "+ n);
        for(int no : numtree){
            if(no >  n){
                System.out.println(no);
                break;
            }
        }
        System.out.println(numtree.higher(n));

//      58.  Write a Java program to get the element in a tree set which is strictly lesser than or equal to the given element.
        System.out.println("Enter the element which is strictly lesser than or equal to the given element : ");
        int sln = sc.nextInt();
        System.out.println("The element in a tree set which is strictly lesser than or equal to "+ n);
        for(int no : numtree){
            if(no >  n){
                System.out.println(no);
                break;
            }
        }
        System.out.println(numtree.lower(n));

//      59. Write a Java program to retrieve and remove the first element of a tree set.
        TreeSet<String> treename = new TreeSet<>();
        treename.add("Lava");
        treename.add("Magma");
        treename.add("Igneous");
        treename.add("Volcano");
        System.out.println("The first element of the tree is: "+treename.first());
        treename.remove(treename.first());
        System.out.println("The tree after removing:  "+treename);

//       60. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("The first element of the tree is: "+treename.last());
        treename.remove(treename.last());
        System.out.println("The tree after removing:  "+treename);

//      61. Write a Java program to remove a given element from a tree set.
        treename.remove("Lava");

        System.out.println(treename);


    }
}
