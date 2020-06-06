package com.shengsiyuan.jvm.classloader;

public class MyTest6 {
    public static void main(String[] args) {
       Singleton singleton = Singleton.getInstance();
        System.out.println("counter1:" + Singleton.counter1);
        System.out.println("counter2:" + Singleton.counter2);
    }
}
/*
    1.准备阶段  从上到下开始赋值
    2.调用getInstance方法导致类的主动使用 类开始进行初始化
    3.初始化阶段 又是从上到下开始赋值
 */
class Singleton{
    public static  int counter1 = 1; //准备阶段 默认值为0

    //新建对象时只会调用构造方法
    private static Singleton singleton = new Singleton();//准备阶段 默认值为null


    //构造方法在准备阶段不会执行
    public Singleton() {
        counter1++;
        counter2++;

        System.out.println(counter1);
        System.out.println(counter2);
    }

    public static  int counter2 = 0;//准备阶段 默认值为0

    public static Singleton getInstance(){
        return singleton;
    }
}
