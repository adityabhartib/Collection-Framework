package com.bridgelabz;

import java.util.*;

public class LearnHashSet {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
      list.add(new Student("Anuj", 12));
      list.add(new Student("Aman", 15));
        list.add(new Student("Rohit", 18));

//        System.out.println(studentset);
//    }
////        Set<Integer> set=new LinkedHashSet<>();
//        Set<Integer> set=new HashSet<>();

//        Set<Integer> set=new TreeSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);
//        set.add(50);
//
//        set.add(50);
//        System.out.println(set);
//set.remove(20);
//        System.out.println(set);
//        System.out.println(set.contains(21));
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        set.clear();
//        System.out.println(set);
//    }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}