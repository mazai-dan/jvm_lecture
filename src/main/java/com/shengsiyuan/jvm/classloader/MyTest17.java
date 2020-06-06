package com.shengsiyuan.jvm.classloader;

import sun.misc.Launcher;

public class MyTest17 {
    public static void main(String[] args) throws Exception{
//        MyTest16 loader1 = new MyTest16("loader1");
//        loader1.setPath("out/production/classes/");
//        Class<?> clazz = loader1.findClass("com.shengsiyuan.jvm.classloader.MyTest17");
//        System.out.println(clazz.getClassLoader().getParent());
//        System.out.println(clazz);
//        System.out.println("class:" + clazz.hashCode());

        //如果注释掉该行，就并不会实例化MySample对象，那么MySample的构造方法就不会被调用
        //也就不会实例化MyCat对象，即不会对MyCat主动使用，也就不会加载MyCat的Class对象
//        Object object = clazz.newInstance();
        System.out.println(Launcher.class.getClassLoader());
    }
}
