package test;

public class LyThread {

    public static void main(String[] args){
            //继承Thread类，复写Thread类，复写thread中run方法，3，调用start方法
        LyText lyThread = new LyText();
        lyThread.start();
        for(int x = 0;x<60;x++){
            System.out.println("helloworld" + x);
        }
    }

}
