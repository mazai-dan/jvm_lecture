package com.shengsiyuan.jvm.classloader;

import java.util.Random;

/*
    当一个接口在初始化时，并不要求其父接口都完成了初始化
    只有在真正使用到父接口的时候（如引用接口中所定义的常量时），才会初始化
 */
public class MyTest5 {
    public static void main(String[] args) {
//        System.out.println(MyChild5.b);

        System.out.println(MyParent5_1.thread);
    }
}

class MyGrandpa{
    public static final Thread a = new Thread(){
        {
            System.out.println("MyGrandpa invoked");
        }
    };
}

class MyParent5 extends MyGrandpa {
    public static final Thread a = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}


class MyChild5 extends MyParent5 {
    public static int b = 5;
}

interface MyGrandpa5_1{
    public static final Thread thread = new Thread(){
        {
            System.out.println("MyGrandpa5_1 invoked");
        }
    };
}

interface MyParent5_1 extends MyGrandpa5_1 {
    public static final Thread thread = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

