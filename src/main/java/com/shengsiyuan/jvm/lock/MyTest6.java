package com.shengsiyuan.jvm.lock;

public class MyTest6 {

    static ThreadLocal<String> threadLocal=new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("Hello World");

        new Thread(()->{
            System.out.println(Thread.currentThread()+":"+threadLocal.get());
        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread()+":"+threadLocal.get());
        }).start();

        System.out.println(Thread.currentThread()+":"+threadLocal.get());

    }
}
