package com.shengsiyuan.jvm.reference;

import java.lang.ref.SoftReference;
import java.util.Date;

public class MyTest1 {
    public static void main(String[] args) {
        Date date = new Date();
        SoftReference<Date> reference = new SoftReference<>(date);

        Date date1 = reference.get();
        if (date1 != null){
            System.out.println("Hello");
        }else {
            System.out.println("World");
        }
        System.out.println("=========================");
        reference.clear();
        Date date2 = reference.get();
        System.out.println(date == date2);
        System.out.println(date1);
    }
}
