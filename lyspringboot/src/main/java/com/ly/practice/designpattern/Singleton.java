package com.ly.practice.designpattern;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }

}
