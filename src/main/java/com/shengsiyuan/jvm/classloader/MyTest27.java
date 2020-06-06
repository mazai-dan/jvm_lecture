package com.shengsiyuan.jvm.classloader;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MyTest27 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//加载META-INF/servies下的mysql驱动并把它注册到DriverManager上
        DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","username","password");
        System.out.println(System.getProperty("jdbc.drivers"));
    }
}
