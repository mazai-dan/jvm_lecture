package com.shengsiyuan.jvm.bytecode;

public class MyTest5 {

    //方法重载，是一种静态行为
    public void test(Grandpa grandpa){
        super.hashCode();
        System.out.println("grandpa");
    }
    public void test(Father father){
        System.out.println("father");
    }
    public void test(Son son){
        System.out.println("son");
    }

    public static void main(String[] args) {
//
//        Grandpa g1 = new Father();
//        Grandpa g2 = new Son();
//
//        MyTest5 myTest5 = new MyTest5();
//        myTest5.test(g1);
//        myTest5.test(g2);

        Father father = new Father();
        father.test();
        Father.test();
    }
}

class Grandpa{
    public static void test(){
        System.out.println("Test");
    }
}
class Father extends Grandpa{
    public Father(){
        super();
    }
    public static void test(){
        System.out.println("Test2");
    }
}

class Son extends Father{}
