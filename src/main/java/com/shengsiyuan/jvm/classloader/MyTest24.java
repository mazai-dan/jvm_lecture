package com.shengsiyuan.jvm.classloader;

public class MyTest24 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader()); //AppClassLoader
        System.out.println(Thread.class.getClassLoader()); //null
    }
}
