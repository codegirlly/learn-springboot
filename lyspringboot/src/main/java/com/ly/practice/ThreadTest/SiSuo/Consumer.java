package com.ly.practice.ThreadTest.SiSuo;

public class Consumer implements Runnable {
    private Info info;
    public Consumer(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int i = 0;i<50;i++){
            try{
                Thread.sleep(100);
            }catch (
                    InterruptedException e
                    ){
                e.printStackTrace();
            }
            System.out.println(
                    this.info.getName()+"  "+this.info.getContent()
            );
        }
    }
}
