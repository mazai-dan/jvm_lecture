package com.shengsiyuan.jvm.classloader;

import java.lang.reflect.Method;

public class MyTest21 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");
        loader1.setPath("/Users/andong/Desktop/");
        loader2.setPath("/Users/andong/Desktop/");

        Class<?> clazz1 = loader1.loadClass("com.shengsiyuan.jvm.classloader.MyPerson");
        Class<?> clazz2 = loader2.loadClass("com.shengsiyuan.jvm.classloader.MyPerson");
        System.out.println(clazz1 == clazz2);//true 因为都是由AppClassLoader负责加载的MyPerson，所以为true

        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        method.invoke(object1, object2);
    }
}
