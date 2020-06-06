package com.shengsiyuan.jvm.classloader;

public class MyTest17_1 {
    public static void main(String[] args) throws Exception{
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("/Users/andong/Desktop/");
        Class<?> clazz = loader1.loadClass("com.shengsiyuan.jvm.classloader.MySample");
        System.out.println("class:" + clazz.hashCode());
        Object o = clazz.newInstance();
        System.out.println(o);
        /*
        删掉MyCat.class
        classpath存在MySample
        class:1627674070
        MySample is loaded by:sun.misc.Launcher$AppClassLoader@18b4aac2
        Exception in thread "main" java.lang.NoClassDefFoundError: com/shengsiyuan/jvm/classloader/MyCat

        AppClassLoader -> ExtClassLoader -> bootStrapClassLoader

        由成功加载MySample.class的AppClassLoader（初始类加载器）去一层一层委托，最终都加载不了MyCat,所以抛出NoClassDefFoundError
        */
    }
}
