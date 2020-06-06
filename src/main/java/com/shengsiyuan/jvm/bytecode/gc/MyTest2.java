package com.shengsiyuan.jvm.bytecode.gc;

import java.util.ArrayList;
import java.util.List;

public class MyTest2 {
    public static void main(String[] args) throws InterruptedException {
//        int size = 1024 * 1024;
//
//        byte[] myAlloc = new byte[5 * size];

//        Thread.sleep(100000000);

//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 * 4 /1024);


        List<String> list = new ArrayList<>(12);
        list.add("a");
    }
}
