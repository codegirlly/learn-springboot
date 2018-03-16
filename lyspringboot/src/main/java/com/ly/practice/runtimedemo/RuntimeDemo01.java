package com.ly.practice.runtimedemo;

public class RuntimeDemo01 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("JVM最大内存："+run.maxMemory());//观察最大内存量
        System.out.println("JVM空闲内存量"+run.freeMemory());//程序运行之前的内存空闲量
        String str = "Hello"+"World"+"!!!";
        System.out.println(str);
        for(int x = 0;x<100000;x++){
            str+=x;
        }
        System.out.println("操作后，JVM空闲内存量："+run.freeMemory());
        run.gc();
        System.out.println("垃圾回收后，JVM空闲内存："+run.freeMemory());
    }
}
