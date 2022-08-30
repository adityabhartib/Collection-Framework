package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
//        Map<String, Integer> number = new HashMap<>();
Map<String,Integer>number=new TreeMap<>();
        number.put("one", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);


        number.remove(3);
//        if (!number.containsKey("Two")){
//            number.put("Two",6);
//        }
//        number.putIfAbsent("Two",6);

        System.out.println(number);
//        for (Map.Entry<String, Integer> e : number.entrySet())
////        System.out.println(e);
//
//        System.out.println(e.getkey());
//    }

//            System.out.println(number.isEmpty());
    }
}
