package com.ly.practice.ThreadTest;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Xiancheng xc = new Xiancheng();
        Thread th = new Thread(xc,"线程");
        th.start();
        for(int x = 0;x<10;x++){
           if(x>5){
               try{
                   th.join();
               }catch(Exception e){
               }
           }
            System.out.println("Main 线程运行"+x);
        }
    }
}
