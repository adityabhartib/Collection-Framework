package com.bridgelabz;

import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        animals.push("lion");
        animals.push("DOg");
        animals.push("Cat");

        System.out.println("Stack: "+animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stack"+animals);
        System.out.println(animals.peek());
    }
}
