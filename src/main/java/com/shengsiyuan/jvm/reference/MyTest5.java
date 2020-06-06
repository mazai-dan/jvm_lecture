package com.shengsiyuan.jvm.reference;

public class MyTest5 {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        threadLocal.set("Hello");
        threadLocal.set("World");

        System.out.println(threadLocal.get());
    }
}
