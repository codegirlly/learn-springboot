package com.ly.practice.basictest;

public class DataDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        char ch1 = 'v';
        System.out.println("整型最大值："+"  "+max);
        System.out.println("整型最大值+1:"+"  "+(max+1));
        System.out.println("整型最大值+1:"+"  "+(max+1l));
        System.out.println("整型最大值+2"+"  "+((long)max+2));
        long maxs = Long.MAX_VALUE;
        System.out.println("长整型最大值："+"  "+maxs+"\n");
        System.out.println("\"hello world\"");
    }
}
