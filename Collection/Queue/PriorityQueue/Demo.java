package Collection.Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(34);
        pq.add(3);
        pq.add(10);
        pq.add(14);
        //smallest---->highest
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println("--------------");

        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(34);
        pq.add(3);
        pq.add(10);
        pq.add(14);
        //smallest---->highest
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
