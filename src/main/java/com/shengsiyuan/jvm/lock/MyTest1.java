package com.shengsiyuan.jvm.lock;

public class MyTest1 {
    private Object object = new Object();

    public synchronized void myMethod(){
        synchronized (object){
            System.out.println("hello world");
        }
    }


    public static void main(String[] args) {
        MyTest1 myTest1 = new MyTest1();
        Thread thread1 = new Thread(()->{myTest1.myMethod();});
        Thread thread2 = new Thread(()->{myTest1.myMethod();});

        thread1.start();
        thread2.start();
    }
}
