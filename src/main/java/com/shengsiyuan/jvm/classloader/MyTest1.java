package com.shengsiyuan.jvm.classloader;

/*
    对于静态字段来说，只有直接定义了该字段的类才会被初始化
    当一个类在初始化时，要求其父类型已经全部初始化完毕
 */
public class MyTest1 {
    public static void main(String[] args) {
        /*
        System.out.println(myChild1.str);
        输出结果 MyParent1 static block
                hello world
        因为没有对子类主动使用所以子类的静态代码块不会被初始化


        ---------------------------------------------
        System.out.println(myChild1.str2);
        输出结果：
        MyParent1 static block
        MyChild1 static block
        welcome
        因为对子类的静态变量主动使用了所以也会同时调用子类的静态代码块
        现有父类型后有子类型，所以父类的静态代码块先执行
*/


        System.out.println(myChild1.str);
    }
}


class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class myChild1 extends MyParent1 {
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}
