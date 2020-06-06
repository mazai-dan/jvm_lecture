package com.shengsiyuan.jvm.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Date;

public class MyTest4 {
    public static void main(String[] args) {
        Date date = new Date();
        ReferenceQueue<Date> referenceQueue = new ReferenceQueue<>();

        PhantomReference<Date> phantomReference = new PhantomReference<>(date,referenceQueue);

        System.out.println(phantomReference.get());
    }
}
