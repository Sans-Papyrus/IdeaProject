package com.mirrorseek.method;

/*
 * 方法的重载(Overload):多个方法的名称一样，但是参数列表不一样
 * 好处:只需要记住唯一一个方法名称，就能实现类似的多个功能
 *
 * 方法重载与以下因素相关
 * 1: 参数的个数不同
 * 2: 参数的类型不同
 * 3: 参数的多类型顺序不同
 *
 * 方法重载与下列因素无关
 * 1: 与参数的名称无关
 * 2: 与方法的返回值无关
 * */
public class Demo8MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10, 56));
        System.out.println(sum(10, 56, 88));
        System.out.println(sum(10, 56, 88, 45));
        System.out.println(sum(10, 56, 89));
    }

    /*
     * 参数的个数不同
     * */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /*
     * 参数的类型不同
     * */
    public static int sum(double a, double b) {
        return (int) (a + b);
    }

    /*
     * 参数的多类型顺序不同
     * */
    public static int sum(double a, int b) {
        return (int) (a + b);
    }

    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    /*以下都是错误写法*/

    // 与参数的名称无关
//    public static int sum(int x, int y) {
//        return x + y;
//    }

    // 与方法的返回值无关
//    public static double sum(int a, int b) {
//        return a + b;
//    }


}
