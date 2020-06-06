package com.shengsiyuan.jvm.classloader;

class Parent2{
    static int a = 3;
    static {
        System.out.println("Parent2 static block");
    }
}

class Child2 extends Parent2{
    static int b = 4;

    static {
        System.out.println("Child2 static block");
    }
}


public class MyTest10 {
    static {
        System.out.println("MyTest10 static block");
    }

    public static void main(String[] args) {
        Parent2 parent2; //仅仅声明一个引用并不会导致类的主动使用，也就不会导致类的初始化

        System.out.println("-----------------");

        parent2 = new Parent2();

        System.out.println("-----------------");

        System.out.println(parent2.a);

        System.out.println("-----------------");

        System.out.println(Child2.b);//对Child2的主动使用，由于Parent2父类在之前已经初始化过，「Parent2 static block」 只会输出一次，表示初始化只会执行一次


    }
}
