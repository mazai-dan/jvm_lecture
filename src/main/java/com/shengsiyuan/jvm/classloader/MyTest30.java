package com.shengsiyuan.jvm.classloader;

public class MyTest30 {
    static int a = 0;
    static {
        a=1;
        b=1;
    }
    static int b = 0;

    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(b);
    }
}
