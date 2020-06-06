package com.shengsiyuan.jvm.bytecode.gc;

public class MyTest5 {
    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[4 * size];

        System.out.println("1111111");
        byte[] myAlloc2 = new byte[4 * size];
        System.out.println("2222222");
        byte[] myAlloc3 = new byte[4 * size];
        System.out.println("3333333");
        byte[] myAlloc4 = new byte[2 * size];
        System.out.println("4444444");

        System.out.println("game over");
    }
}
