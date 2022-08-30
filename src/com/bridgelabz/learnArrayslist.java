package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class learnArrayslist {
    public static void main(String[] args) {
//        ArrayList<String> studentName =new ArrayList<>();
//        studentName.add("Rakesh");
//        System.out.println(studentName);


//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(6);
//        System.out.println(list);
//
//        list.add(0,50);
//        System.out.println(list);
//
//        List<Integer> newlist =new ArrayList<>();
//        newlist.add(150);
//        newlist.add(160);
//
//        list.addAll(newlist);
//        System.out.println(list);
//        System.out.println(list.get(1));
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(68);
        list.contains(20);
        System.out.println(list.contains(20));
list.remove(0);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list);
        list.add(2,89);
        System.out.println(list.get(3));
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.set(2,30));
       list.clear();
        System.out.println(list);
       list.retainAll(list);
        System.out.println(list);

//        list.remove(Integer.valueOf(50));
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//list.set(1,1000);
//        System.out.println(list);
//        System.out.println(list.contains(40));
//        for (int i=0; i<list.size(); i++) {
//            System.out.println("The Element is: " + list.get(i));
//        }
//            for (Integer element:list) {
//                System.out.println("Foreach Element is: "+element);
//            }
//        Iterator<Integer> it =list.iterator();
//
//            while (it.hasNext()){
//                System.out.println("iterator"+it.next());
//            }
        }
    }
