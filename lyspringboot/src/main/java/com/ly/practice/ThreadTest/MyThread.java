package com.ly.practice.ThreadTest;

public class MyThread implements Runnable {
    private int ticket = 5;

    @Override
   /* public void run() {
        for(int i=0;i<100;i++){
            synchronized (this){
                if(ticket>0){
                    try{
                        Thread.sleep(300);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("买票：ticket="+ticket--);
                }
            }
        }
    }*/
   public void run(){
       for(int i = 0;i<100;i++){
           this.sale();
       }
    }
    public synchronized void sale(){
       if(ticket>0){
           try{
               Thread.sleep(300);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
           System.out.println("买票：ticket="+ticket--);
       }
    }
}
