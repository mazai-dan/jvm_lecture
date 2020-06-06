package com.shengsiyuan.jvm.classloader;

/*
    常量在编译阶段会存入到调用这个常量所在的方法所在类的常量池当中
    本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量类的初始化
    注意这里指的是将常量存放到了MyTest2的常量池中，之后MyTest2与MyParent2没有任何关系了，
    甚至我们可以将MyParent2的Class文件删掉。
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.s);
    }
}

class MyParent2{
//    public static final String str = "hello world"; 加上final表示常量，在编译期已经确定，所以JVM编译器直接会将该常量放置到调用该方法所在类的常量池当中
////    public static  String str = "hello world";
    public static final   String str = "hello world";

    public static final short s = 128;

    public static final int i = -1;

    public static final int m = 5;

    static {
        System.out.println("MyParent2 static block");
    }
}