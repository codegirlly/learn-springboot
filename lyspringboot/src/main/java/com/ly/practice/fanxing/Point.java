package com.ly.practice.fanxing;

public class Point<T> {
      private T var;                   //此变量的类型由外部决定
      public Point(T var){
          this.var = var;
      }
      public T getVar(){               //返回值得类型由外部决定
          return var;
      }
      public void setVar(T var){
          this.var = var;
      }

}
