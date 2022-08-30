package com.bridgelabz;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq= new ArrayDeque<>();

        adq.offer(12);
        adq.offerFirst(15);
        adq.offerLast(18);
        adq.offer(15565);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Poll()" +adq);
        System.out.println(adq.pollFirst());
        System.out.println("PollFirst()" +adq);

        System.out.println(adq.pollLast());
        System.out.println("POlllast()"+adq);

    }
}
