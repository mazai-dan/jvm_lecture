package com.shengsiyuan.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class MyTest14 {
    public static void main(String[] args) throws IOException {
        //线程的上下文类加载器主要是由线程的创建者来提供的
        ClassLoader classLoader =Thread.currentThread().getContextClassLoader();//返回这个线程的上下文类加载器
        System.out.println(classLoader);//当前启动应用的类加载器是Application ClassLoader，因此上下文类加载器也是Application ClassLoader

        String resourcesName = "com/shengsiyuan/jvm/classloader/MyTest13.class";

        Enumeration<URL> urls = classLoader.getResources(resourcesName);

        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("-------------------------");

//        Class<?> clazz = MyTest14.class;
//        System.out.println(clazz.getClassLoader());//AppClassLoader

        Class<?> clazz = String.class;
        System.out.println(clazz.getClassLoader());//null


    }
}
