package com.shengsiyuan.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class MyTest26 {
    public static void main(String[] args) {

//        Thread.currentThread().setContextClassLoader(MyTest26.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterable = loader.iterator();

        while (iterable.hasNext()){
            Driver driver = iterable.next();
            System.out.println("driver:" + driver.getClass() + ",loader:"+driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器："+Thread.currentThread().getContextClassLoader());
        System.out.println("ServceLoader的类加载器"+ServiceLoader.class.getClassLoader());
    }
}