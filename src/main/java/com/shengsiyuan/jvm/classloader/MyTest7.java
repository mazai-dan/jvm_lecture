package com.shengsiyuan.jvm.classloader;

public class MyTest7 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2 = C.class;
        System.out.println(clazz2.getClassLoader());
    }
}

class C{


}