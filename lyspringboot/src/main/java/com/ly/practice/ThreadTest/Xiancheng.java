package com.ly.practice.ThreadTest;

public class Xiancheng implements Runnable {
    @Override
    public void run() {
        System.out.println("进入run方法");
        for(int i = 0;i<3;i++){
            try{
                Thread.sleep(10000);//休眠10s
                System.out.println("完成休眠");
            }catch (Exception e){
                System.out.println("休眠终止");
                return;
            }
            System.out.println(Thread.currentThread().getName()+"运行"+i);
        }
    }
}

