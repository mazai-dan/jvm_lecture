package com.shengsiyuan.jvm.classloader;

import java.math.BigDecimal;

public class MyTest25 implements Runnable {

    private Thread thread;

    public MyTest25() {
        this.thread =new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        System.out.println("Class:"+classLoader.getClass());
        System.out.println("Parent:"+classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
//        new MyTest25();

        System.out.println(BigDecimal.valueOf(Double.parseDouble("15013850")).doubleValue() );
    }
}
