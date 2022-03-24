package com.mirrorseek.method;
/*
* 对于一个void没有返回值的方法，不能写有返回值的return，只能return自己
* 对于void方法，最后一行的return可以省略不写
* 一个方法中可以有多个return语句，但是必须保证同时只有一个会被被执行到
* */
public class Demo8MethodNotice {
    public static void main(String[] args) {
        System.out.println(getMax(1000,100));
        System.out.println(catMax(100,58));
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static int catMax(int a, int b){
        int max;
        if (a > b) {
            max = a;
        }else {
            max = b;
        }
        return max;
    }
}
