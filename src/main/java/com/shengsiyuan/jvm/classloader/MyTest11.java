package com.shengsiyuan.jvm.classloader;
class Parent3{
    static int a =3;
    static {
        System.out.println("Parent3 static block");
    }

    public static void doSomething(){
        System.out.println("doSomething.....");
    }
}

class Child3 extends Parent3{
    static {
        System.out.println("Child3 static block");
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child3.a);
        System.out.println("-------------------");
        Child3.doSomething();
        /*
        输出结果：
        Parent3 static block   Child3.a 对父类的主动使用 「谁拥有的静态变量就代表对谁的主动使用」
        3
        -------------------
        doSomething.....
         */
    }
}
