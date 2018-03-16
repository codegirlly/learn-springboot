package com.ly.practice.fanxing;

public class GenericsDemo09 {
    public static void main(String[] args) {
        NotePad<String,Integer> t = null;
        t = new NotePad<String, Integer>();
        t.setKey("lyy");
        t.setValue(10);
        System.out.println("姓名："+t.getKey());
        System.out.println("姓名："+t.getValue());
    }
}
