package com.mirrorseek.method;
/*
* 定义一个方法
* 打印指定次数Hello,World!S
* */
public class Demo7MethodPrint {
    public static void main(String[] args) {
        PrintCount(45);
    }
    public static void PrintCount(int x){
        for (int i = 0; i < x; i++){
            System.out.println("Hello,World!");
        }
    }
}
