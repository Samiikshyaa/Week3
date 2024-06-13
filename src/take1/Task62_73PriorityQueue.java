package take1;

import java.util.*;

public class Task62_73PriorityQueue {
    public static void main(String[] args) {
//     62.   Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        colors.add("Orange");
        System.out.println(colors); //according to the internal heap structure, min heap, binary heap tree,
        while(!colors.isEmpty()){
            System.out.println(colors.poll());
        }

//    63. Write a Java program to iterate through all elements in priority queue.
        PriorityQueue<String> colors2 = new PriorityQueue<>();
        colors2.add("Red");
        colors2.add("Blue");
        colors2.add("Black");
        colors2.add("Green");
        System.out.println(colors2);

        System.out.println("Iterating through the priority queue."); // returns the value like sout("priorityQueue")
        Iterator<String> it = colors2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//      64.  Write a Java program to add all the elements of a priority queue to another priority queue.
        PriorityQueue<String> nameofDogs = new PriorityQueue<>();
        nameofDogs.add("Tommy");
        nameofDogs.add("Mimi");
        nameofDogs.add("Pooh");
        PriorityQueue<String> nameofCats = new PriorityQueue<>();
        nameofCats.add("Meow");
        nameofCats.add("Mellow");
        nameofCats.add("Shishi");

//         By creating new priority queue.
//        PriorityQueue<String> addedNames = new PriorityQueue<>(nameofDogs);
//        addedNames.addAll(nameofCats);

        nameofDogs.addAll(nameofCats);
        System.out.println("Adding the names of dog and cat in the single queue");
        while (!nameofDogs.isEmpty()){
            System.out.println(nameofDogs.poll());
        }

//      65.  Write a Java program to insert a given element into a priority queue.
        PriorityQueue<String> pq = new PriorityQueue<>();
        try {
            pq.add("Hello");
            pq.add("Hello1");
            pq.add("Hello2");
            pq.add("Hello3");
            pq.add("Hello4");

            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the element to insert: ");
            String obj = sc.next();
            pq.add(obj);

            System.out.println(pq);

            System.out.println("After adding element: ");
            while (!pq.isEmpty()) {
                System.out.println(pq.poll());
            }
        } catch (ClassCastException e){
            System.err.println("Object cannot be cast to string:");
        }

//      66. Write a Java program to remove all the elements from a priority queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Hell");
        priorityQueue.add("Hel");
        priorityQueue.add("Hello");
        priorityQueue.add("ello");

        priorityQueue.remove("Hello");
        System.out.println("Before Removing all the elements from the priority queue: ");
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        System.out.println("After removing elements:  "+priorityQueue);

//      67.  Write a Java program to count the number of elements in a priority queue.

        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("Ello");
        priorityQueue1.add("Mello");
        priorityQueue1.add("Jello");
        priorityQueue1.add("Yellow");

        System.out.println("The size of the priority queue created is: "+priorityQueue1.size());


//      68. Write a Java program to compare two priority queues.
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add("Ello1");
        priorityQueue2.add("Mello");
        priorityQueue2.add("Jello");
        priorityQueue2.add("Yellow");

        System.out.println("Result of the comparison is: "+priorityQueue1.equals(priorityQueue2));

//       69. Write a Java program to retrieve the first element of the priority queue
        System.out.println("The first element of the priority queue is:(without removing it) "+priorityQueue2.peek());


//       70. Write a Java program to retrieve and remove the first element of the priority queue.
        System.out.println("The first element of the priority queue is: (retriving and removing) " +priorityQueue2.poll());
        System.out.println("The elements after removing the first element: ");
        while(!priorityQueue2.isEmpty()) {
            System.out.println(priorityQueue2.poll());
        }


//       71. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.

        PriorityQueue<String> priorityQueueForArray = new PriorityQueue<>();
        priorityQueueForArray.add("Ello");
        priorityQueueForArray.add("Mello");
        priorityQueueForArray.add("Jello");
        priorityQueueForArray.add("Yellow");
        priorityQueueForArray.add("Samikshya");

        String[] array = new String[priorityQueueForArray.size()];

        for (int j = 0; j < array.length; j++) {
            array[j] = priorityQueueForArray.poll();
        }

        System.out.println("The array is: "+Arrays.toString(array));


//     72.   Write a Java program to convert Priority Queue elements to a string representation.
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(100);
        integers.add(500);
        integers.add(40);
        integers.add(45);

        StringBuilder sb = new StringBuilder();
        while (!integers.isEmpty()){
            sb.append(integers.poll());
            if(!integers.isEmpty()){
                sb.append(" , ");
            }
        }
        System.out.println(sb);

//        PriorityQueue<String> integerss = new PriorityQueue<>();
//        integerss.add("Red");
//        integerss.add("Blue");
//        integerss.add("Black");
//        integerss.add("Green");
//
//        StringBuilder sbs = new StringBuilder();
//        while (!integerss.isEmpty()){
//            sbs.append(integerss.poll());
//            if(!integerss.isEmpty()){
//                sbs.append(" , ");
//            }
//        }
//        System.out.println(sbs);


//        73. Write a Java program to change priorityQueue to maximum priority queue.

            PriorityQueue<String> colorful = new PriorityQueue<>();
            colorful.add("Red");
            colorful.add("Blue");
            colorful.add("Black");
            colorful.add("Green");
            int i =0;
            String[] colorarray = new String[colorful.size()];
            while (!colorful.isEmpty()){
                colorarray[i] = colorful.poll();
                i++;
            }
//            System.out.println(Arrays.toString(colorarray));

        System.out.println("\nMaximum priority Queue");
        for (int j = colorarray.length-1; j >= 0; j--) {
            System.out.println(colorarray[j]);
        }

            //using predefined way.
        System.out.println("Using Collections.========");
            PriorityQueue<String> ps = new PriorityQueue<>(Collections.reverseOrder());
            ps.add("Red");
            ps.add("Blue");
            ps.add("Green");
            ps.add("Black");
            ps.add("Green");

            while (!ps.isEmpty()){
                System.out.println(ps.poll());
            }

    }
}
