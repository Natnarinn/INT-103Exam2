package teaching;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

    // FIFO, FCFS
    public static void main(String[] args) {
        Queue<String> queues = new LinkedList<>();
        queues.offer("1st");
        queues.offer("2nd");
        queues.offer("3th");
        queues.offer("4th");

        System.out.println(queues);

        System.out.println(queues.peek());

        System.out.println(queues.poll());
        System.out.println(queues);

        System.out.println(queues.remove("3th"));
        System.out.println(queues);
    }

}
