package com.shengsiyuan.jvm.bytecode.gc;

public class MyTest4 {

    public static void main(String[] args) throws InterruptedException {
        byte[] byte1 = new byte[512 * 1024];
        byte[] byte2 = new byte[512 * 1024];

        myGc();
        Thread.sleep(1000);

        System.out.println("11111111");

        myGc();
        Thread.sleep(1000);

        System.out.println("222222222");

        myGc();
        Thread.sleep(1000);

        System.out.println("333333333");

        myGc();
        Thread.sleep(1000);

        System.out.println("44444444444");

        byte[] byte3 = new byte[1024 * 1024];
        byte[] byte4 = new byte[1024 * 1024];
        byte[] byte5 = new byte[1024 * 1024];

        myGc();
        Thread.sleep(1000);

        System.out.println("55555555555");

        myGc();
        Thread.sleep(1000);

        System.out.println("66666666666");

        System.out.println("game over");

    }

    private static void myGc() {
        for (int i = 0; i < 40; i++) {
            byte[] byteArray = new byte[1024 * 1024];
        }
    }

}






