package com.ly.practice.ThreadTest.SiSuo;

public class Producer implements Runnable {
    private Info info = null;
    public Producer(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for(int i = 0;i<50;i++){
            if(flag){
                this.info.setName("lyy");
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
               this.info.setContent("JAVA讲师");
                flag = false;
            }else{
                this.info.setName("mldn");
                try{
                    Thread.sleep(90);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                this.info.setContent("www.mldnjaca.cn");
                flag = true;
            }
        }
    }
}
