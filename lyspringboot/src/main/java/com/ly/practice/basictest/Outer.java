package com.ly.practice.basictest;

public class Outer {

    private String info = "hello world";
    class Inner{
        public void print(){
            System.out.println(info);
        }
    }
    public void fun(){
        new Inner().print();
    }

}
//public class InnerClassDemo{
//    public static void main(String[] args) {
//        new Outer().fun();
//    }
//}