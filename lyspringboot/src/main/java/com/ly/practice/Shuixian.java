package com.ly.practice;

public class Shuixian {

    public void panDuan() {
        for (int i = 1; i <= 10000; i++) {
            xunHuan(i);
        }


    }

    public static void main(String[] args) {
          Shuixian sx = new Shuixian();
        sx.panDuan();

    }

    public void xunHuan(int i){
        int temp = i;
        int sum = 0;
        int x = 0;
        while(temp!=0){

            x = temp%10;
            temp = temp/10;
            sum += x*x*x;
        }
        if(i==sum){
            System.out.println(i);
        }

    }
}
