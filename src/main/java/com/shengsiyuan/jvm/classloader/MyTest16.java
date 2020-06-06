package com.shengsiyuan.jvm.classloader;

import java.io.*;

/*
    自定义类加载器
 */
public class MyTest16 extends ClassLoader {

    private String classLoaderName;

    private String path;

    private final String fileExtension = ".Class";


    public MyTest16(ClassLoader parent){
        super(parent);
    }

    public MyTest16(String classLoaderName) {
        super();//将系统类加载器当作该类加载器的父类加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);//显式指定该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String binaryName) throws ClassNotFoundException {
        System.out.println("findCLass Invoke");
        System.out.println("classloader name:" + classLoaderName);

        byte[] data = loadClassData(binaryName);
        return this.defineClass(binaryName, data, 0, data.length);
    }

    /**
     * @param binaryName
     * @return
     */
    private byte[] loadClassData(String binaryName) {
        InputStream in = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        binaryName = binaryName.replace(".","/");

        try {
//            this.classLoaderName = this.classLoaderName.replace(".", "/");

            in = new FileInputStream(new File(this.path + binaryName + this.fileExtension));

            baos = new ByteArrayOutputStream();

            int ch = 0;
            while (-1 != (ch = in.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                in.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }


    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> clazz = classLoader.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");
        Object object = clazz.newInstance();
        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());
    }


    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
//        loader1.setPath("/Users/andong/projectSpace/jvm_lecture/out/production/classes/");
        loader1.setPath("/Users/andong/Desktop/");

        Class<?> clazz = loader1.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz.hashCode());
        Object object = clazz.newInstance();
        System.out.println("object:" + object);

        System.out.println("-------------------");

        loader1 = null;
        clazz = null;
        object = null;

        System.gc();

        Thread.sleep(100000);

        loader1 = new MyTest16("loader2");
        loader1.setPath("/Users/andong/Desktop/");
        clazz = loader1.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz.hashCode());
        object = clazz.newInstance();
        System.out.println("object:" + object);



//        MyTest16 loader2 = new MyTest16(loader1,"loader2");
//        loader2.setPath("/Users/andong/Desktop/");
//        Class<?> clazz2 = loader2.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");
//        System.out.println("class:" + clazz2.hashCode());
//        Object object2 = clazz.newInstance();
//        System.out.println("object:" + object2);
//
//        System.out.println("-------------------");
//        MyTest16 loader3 = new MyTest16(loader2,"loader3");
//        loader3.setPath("/Users/andong/Desktop/");
//        Class<?> clazz3 = loader3.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");
//        System.out.println("class:" + clazz3.hashCode());
//        Object object3 = clazz3.newInstance();
//        System.out.println("object:" + object3);
    }
}
