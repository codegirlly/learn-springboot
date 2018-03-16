package com.ly.practice.fanxing;

public class GenericsDemo10 {
    public static void main(String[] args) {
        Info<String> info = new Info();
        info.setVar("lyy");
        System.out.println("内容："+info.getVar());
    }
}
