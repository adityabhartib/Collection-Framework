package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {

        List<Integer>list =new ArrayList<>();
        list.add(32);
        list.add(63);
        list.add(56);
        list.add(45);

//        System.out.println("min element"+ Collections.max(list));
//        System.out.println("max element"+Collections.min(list));
//        System.out.println(Collections.frequency(list,63));
   Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
