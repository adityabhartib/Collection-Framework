package com.bridgelabz;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = Arrays.binarySearch(numbers, 4);
//        System.out.println("Array Index"+index);

        Integer[] number ={10,2,30,61,54,45,52};
        Arrays.sort(number);

        Arrays.fill(number ,12);

        for (int i:number){
            System.out.print(i+" ");
        }
    }
}