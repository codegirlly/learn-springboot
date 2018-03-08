package com.ly.practice.ThreadTest;

public class ThreadInterruptDemo {
    public static void main(String[] args) {
        Xiancheng xc = new Xiancheng();
        Thread t = new Thread(xc,"线程");
        t.start();
        try{
            Thread.sleep(11000);
        }catch(Exception e){

        }
        t.setDaemon(true);t.interrupt();
    }
}
