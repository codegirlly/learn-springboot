package com.ly.practice;

/**
 * 能被357整除的数
 */
public class Zhengchu {

    public void lianxi(){

        for(int x = 1;x<=1000;x++){

            if(x%3==0&&x%5==0&&x%7==0){
                System.out.println(x);
            }

        }

    }

    public static void main(String[] args) {
        Zhengchu zc = new Zhengchu();
        zc.lianxi();
    }
}
