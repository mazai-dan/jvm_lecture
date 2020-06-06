package com.shengsiyuan.jvm.bytecode;

public class MyTest2 {
    String str = "welcome";

    private int x = 5;

    private static Integer in = 10;

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        myTest2.setX(10);
        in = 5;
    }

    public void setX(int x) {
        this.x = x;
    }
}
