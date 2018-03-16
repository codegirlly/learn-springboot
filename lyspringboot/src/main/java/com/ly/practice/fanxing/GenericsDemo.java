package com.ly.practice.fanxing;

public class GenericsDemo {
    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>(11);
        p.setVar(30);
        System.out.println(p.getVar()*2);
    }
}
