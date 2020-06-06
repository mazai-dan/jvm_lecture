package com.shengsiyuan.jvm.classloader;

import java.util.concurrent.Callable;

public class MyTest33 {
    static void invoke(Runnable r){
        r.run();
    }

    static <T> T invoke(Callable<T> c) throws Exception {
       return c.call();
    }

    public static void main(String[] args) throws Exception {
        String s = invoke(()->"done");
        System.out.println(s);
    }
}
