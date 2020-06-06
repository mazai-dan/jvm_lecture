package com.shengsiyuan.jvm.classloader;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MyTest34 {

    public MethodHandle getToStringMH() {
        MethodHandle mh = null;
        MethodType mt = MethodType.methodType(String.class);
        MethodHandles.Lookup lk = MethodHandles.lookup();

        try {
            mh = lk.findVirtual(getClass(), "toString", mt);
        } catch (NoSuchMethodException | IllegalAccessException mhx) {
            throw (AssertionError)new AssertionError().initCause(mhx);
        }

        return mh;
    }

    public static void main(String[] args) throws Throwable {
        MyTest34 myTest34 = new MyTest34();
        MethodHandle toString = myTest34.getToStringMH();
        System.out.println(toString.invoke(myTest34));
    }

    @Override
    public String toString() {
        return "Hello World";
    }
}
