package com.shengsiyuan.jvm.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Date;

public class MyTest2 {
    public static void main(String[] args) {
        Date date = new Date();
        ReferenceQueue<Date> queue = new ReferenceQueue<>();
        SoftReference<Date> reference = new SoftReference<>(date,queue);
        System.out.println( reference.get());

        date = null;
        System.gc();

        System.out.println( reference.get());

    }
}
