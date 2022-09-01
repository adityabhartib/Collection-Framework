package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LearnLinkedlistAndQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue=new LinkedList<>();
//        queue.offer(12);
//        queue.offer(15);
//        queue.offer(16);
//
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue.remove(20));
//        System.out.println(queue.contains(12));
//
//        System.out.println(queue.poll());
//        System.out.println(queue);
//
//        System.out.println(queue.peek());
//        System.out.println(queue);

        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(20);
        list.add(30);
        list.add(35);
        list.add(46);
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.indexOf(30));
    }
}
