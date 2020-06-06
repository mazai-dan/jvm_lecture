package com.shengsiyuan.jvm.bytecode;

import java.util.ArrayList;
import java.util.List;

public class MyTest11 {
    public int test(){
        int i ;

        try {
            i = 1;
            return i;
        }catch (Exception ex){
            i = 2;
            return i;
        }finally {
//            System.out.println("finally");
            i = 3;
        }
    }

    public static void main(String[] args) {

//        int num = new MyTest11().test();
//        System.out.println(num);

        List<String> list = new ArrayList<>(10);
    }
}
