package com.shengsiyuan.jvm.bytecode.gc;

/**
 * VM Args:-Xss128k
 */
public class JavaVMStackSOF {
    private int stackLength;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        }catch (Throwable ex){
            System.out.println("Stack Length:"+javaVMStackSOF.stackLength);
            throw ex;
        }

    }
}
