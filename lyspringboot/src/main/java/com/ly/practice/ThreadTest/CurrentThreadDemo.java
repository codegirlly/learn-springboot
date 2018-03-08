package com.ly.practice.ThreadTest;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Xiancheng xc = new Xiancheng();
        new Thread(xc,"线程").start();
        xc.run(        );
    }
}
