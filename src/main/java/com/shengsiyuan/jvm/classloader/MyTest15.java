package com.shengsiyuan.jvm.classloader;

public class MyTest15 {

    public static void main(String[] args) {
        String[] strings = new String[1];
        System.out.println(strings.getClass().getClassLoader());//null 表示由BootStrap ClassLoader加载
        //虽然数组的类加载器是BootStrap ClassLoader 但是数组并不是类加载器来加载的，而是在运行期由JVM虚拟机动态创建的
        System.out.println("--------");
        MyTest15[] myTest15s = new  MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader());
        System.out.println("---------");
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());//null 表示没有类加载器

    }
}
