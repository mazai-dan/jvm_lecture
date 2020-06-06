package com.shengsiyuan.jvm.classloader;

import java.util.HashMap;
import java.util.Map;

public class MyTest36 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>() {{
            System.out.println(this.getClass().getSuperclass().getSuperclass());
        }};
        System.out.println(map.getClass());
    }
}
