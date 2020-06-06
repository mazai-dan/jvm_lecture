package com.shengsiyuan.jvm.classloader;

import sun.misc.Launcher;

import java.net.URLStreamHandlerFactory;

public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));


        System.out.println(ClassLoader.class.getClassLoader());

        //扩展类加载器与系统类加载器也是由启动类加载器所加载的
        System.out.println(Launcher.class.getClassLoader());
        System.out.println("------------");
        System.out.println(System.getProperty("java.system.class.loader"));

        System.out.println(MyTest23.class.getClassLoader());
        System.out.println(MyTest16.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
