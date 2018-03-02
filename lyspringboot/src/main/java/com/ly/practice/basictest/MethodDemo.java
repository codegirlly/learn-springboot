package com.ly.practice.basictest;

public class MethodDemo {

    public static void main(String[] args) {
        int one = add(10,20);
        int two = add(10,20,30);
        //float three = add(10.3f+13.3f);

    }

    public static int add(int x, int y){

        int temp = 0;
         temp = x+y;
        return temp;

    }

    public static int add(int x,int y,int z){

        int temp;
        temp = x+y+z;
        return temp;

    }

    public static float add(float x,float y){

        float temp = 0;
        temp = x+y;
        return temp;

    }
}
