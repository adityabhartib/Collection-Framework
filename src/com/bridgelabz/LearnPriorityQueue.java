package com.bridgelabz;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(16);
        pq.offer(18);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
