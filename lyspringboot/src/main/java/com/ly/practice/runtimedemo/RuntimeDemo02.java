package com.ly.practice.runtimedemo;

public class RuntimeDemo02 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try{
            run.exec("notepad.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
