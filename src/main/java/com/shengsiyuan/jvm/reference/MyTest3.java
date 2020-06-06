package com.shengsiyuan.jvm.reference;

import java.lang.ref.WeakReference;
import java.util.Date;

public class MyTest3 {
    public static void main(String[] args) {
        Date date = new Date();
        WeakReference<Date> weakReference = new WeakReference<>(date);

        date = null;
        System.gc();

        System.out.println(weakReference.get());

    }
}
