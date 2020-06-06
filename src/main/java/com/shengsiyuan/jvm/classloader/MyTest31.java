package com.shengsiyuan.jvm.classloader;

public class MyTest31 {
    public void test(Object o) {
        System.out.println("Object");
    }
    public void test(String s) {
        System.out.println("String");
    }
    public static void main(String[] args) {
        MyTest31 that = new MyTest31();
        that.test(null);
    }
}
