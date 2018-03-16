package com.ly.practice.basictest;
/*
1、内部类可以直接访问外部类中成员，包括私有。
2、外部类要访问内部类，必须建立内部类对象。
 */
public class Outer {

    int x = 3;
    class Inner//内部类
    {
        public void function(){
            System.out.println("inner:"+x);
        }
    }

    void method(){
        Inner in = new Inner();
        in.function();
        System.out.println(x);
    }
}