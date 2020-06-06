package com.shengsiyuan.jvm.classloader;

import javax.sound.midi.Soundbank;

/*
    对于数组实力来说，其类型是由JVM在运行期动态生成的，表示为：[Lcom.shengsiyuan.jvm.classloader.MyParent4
    这种形式。动态生成的类型其父类型就是Object。

    对于数组来说，JavaDoc经常将构成数组的元素成为Component，实际上就是将数组降低一个维度后的类型
 */
public class MyTest4 {
    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();
        MyParent4[] myParent4s1 = new MyParent4[1];
        //这里仅仅创建的是数组类型的MyParent4，并不会主动使用MyParent4，也就不会导致类的初始化。
//        System.out.println(myParent4s.getClass());
        //class [Lcom.shengsiyuan.jvm.classloader.MyParent4;
        //上面这个类型是JAVA虚拟机在运行期帮助我们创建出来的，是一个数组类型


        MyParent4[][] myParent4s = new MyParent4[1][1];
        System.out.println(myParent4s.getClass());
//      class [[Lcom.shengsiyuan.jvm.classloader.MyParent4;
        System.out.println(myParent4s.getClass().getSuperclass());
        //class java.lang.Object

        int[] ints = new int[1];
        System.out.println(ints.getClass());//class [I
        System.out.println(ints.getClass().getSuperclass());//class java.lang.Object

        char[] chars = new char[1];
        System.out.println(chars.getClass());

        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());

        short[] shorts = new short[1];
        System.out.println(shorts.getClass());

        byte[] bytes = new byte[1];
        System.out.println(bytes.getClass());
    }
}

class MyParent4{

    static {
        System.out.println("MyParent4 static block");
    }
}