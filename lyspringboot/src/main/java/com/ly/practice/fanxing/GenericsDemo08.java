package com.ly.practice.fanxing;

public class GenericsDemo08 {
    public static void main(String[] args) {
        Point<String> p = null;
        p = new Point<String>("lyy");
        System.out.println("内容："+p.getVar());
    }
}
