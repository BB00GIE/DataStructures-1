package Fall2019.ch06;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Oct24 {


    /*
    queues are First in first out

    enqueue: add(), or Offer()

    dequeue: remove(), or poll()

    First: element(), or peek()
    
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.printf("01: queue is empty?  %s\n" , queue.isEmpty());

        //Enqueue
        queue.add("Pear");
        queue.offer("Cocconut");
        System.out.printf("02: queue is empty?  %s\n" , queue.isEmpty());

        //Dequeue
        String x = queue.remove();
        System.out.printf("03: just removed ====>  %s\n" , x);
        System.out.printf("04: queue is empty?  %s\n" , queue.isEmpty());
        System.out.printf("05: just removed ====>  %s\n" , queue.poll());
        System.out.printf("06: queue is empty?  %s\n" , queue.isEmpty());
        System.out.printf("07: just removed ====>  %s\n" , queue.poll());

        //First element
        queue.add("Pear");
        queue.offer("Cocconut");
        queue.offer("Peach");
        queue.offer("Fig");
        String y = queue.element();
        System.out.printf("08: The first element is ====>  %s\n" , y);
        System.out.printf("09: just removed ====>  %s\n" , queue.poll());
        String z = queue.element(); //Throws exception if queue is empty
        System.out.printf("10: The first element is ====>  %s\n" , z);
        System.out.printf("11: just removed ====>  %s\n" , queue.poll());
        System.out.printf("12: The first element is ====>   %s\n" , queue.peek());
        queue.poll();
        queue.poll();
        System.out.printf("13: queue is empty?  %s\n" , queue.isEmpty());


        //Iterate over a queue
        queue.add("Lemon");
        queue.add("cherry");
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Kiwi");

        for(int i =0; i<queue.size();i++) {
            //Cant access arbitrary item inside the queue
        }
        Iterator<String> queueIterator = queue.iterator();
        String s;
        while(queueIterator.hasNext()) {
            s = queueIterator.next();
            System.out.printf(" %s ", s);
        }






    }



}
