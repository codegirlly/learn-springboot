package com.ly.practice.basictest;

import com.ly.practice.Single;

public class Singleton {

    private static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton singleton(){
        return instance;
    }

    public static void main(String[] args) {

    }


}
