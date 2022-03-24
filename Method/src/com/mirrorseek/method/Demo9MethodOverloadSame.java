package com.mirrorseek.method;

/*
 * 比较两个数字是否相等
 * 参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型。
 * 在main方法中进行测试
 * */
public class Demo9MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame((byte) 10, (byte) 89));
        System.out.println(isSame((short) 10, (short) 10));
        System.out.println(isSame(10, 56));
        System.out.println(isSame(20L, 20L));
        System.out.println(isSame(45F,45F));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("byte类型的方法执行了！");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short类型的方法执行了!");
        boolean same;
        same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("int类型的方法执行了!");
        boolean same;
        same = a == b;
        return same;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("long类型的方法执行了!");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(float a, float b) {
        System.out.println("float类型的方法执行了!");
        return a == b;
    }
}
