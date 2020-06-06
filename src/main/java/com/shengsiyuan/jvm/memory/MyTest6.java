package com.shengsiyuan.jvm.memory;

import java.util.Stack;

public class MyTest6 {
    public static void main(String[] args) {
        Stack<Integer> integer = new Stack<>();

        integer.push(1);
        integer.push(2);
        integer.push(3);
        integer.push(4);

        System.out.println(integer.peek());
    }
}
