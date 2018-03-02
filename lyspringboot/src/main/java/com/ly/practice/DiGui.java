package com.ly.practice;

public class DiGui {
    public static int fn(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fn(n - 1) + fn(n - 2);


    }

    public static int plus(int n){

        if(n==1){
            return 1;
        }
        if(n==2){
            return 3;
        }

        return plus(n-1)+n;

    }
    public static void main(String[] args) {
      //  System.out.println(DiGui.fn(7));
        System.out.println(DiGui.plus(100));
    }

    public static int sum(int num){

        if(num==1){
            return 1;
        }else {
            return num+sum(num-1);
        }

    }
}
