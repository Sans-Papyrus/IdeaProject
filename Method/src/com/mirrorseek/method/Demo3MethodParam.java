package com.mirrorseek.method;

public class Demo3MethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        PrintStr();
    }
    /*
    *有参数
    * */
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是: " + result);
    }
    /*
    * 无参数
    * */
    public static void PrintStr() {
        for (int i = 0; i < 10; i++) {
            System.out.println("丑死了！");
        }
    }
}
