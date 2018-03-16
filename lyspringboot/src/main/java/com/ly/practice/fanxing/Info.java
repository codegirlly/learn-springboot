package com.ly.practice.fanxing;

public class Info<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public String toString(){               //覆写Object类中的toString（）方法
        return this.var.toString();
    }
}
