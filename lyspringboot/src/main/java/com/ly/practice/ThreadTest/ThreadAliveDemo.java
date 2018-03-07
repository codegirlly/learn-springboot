package com.ly.practice.ThreadTest;

public class ThreadAliveDemo {
    public static void main(String[] args) {
        Xiancheng xc = new Xiancheng();
        Thread t = new Thread(xc,"线程");
        System.out.println("线程开始之前"+t.isAlive());
        t.start();
        System.out.println("线程开始之后"+t.isAlive());
        for(int i = 0;i<3;i++){
            System.out.println("main运行"+i);
        }
        System.out.println("代码执行之后"+t.isAlive());
    }
}
