package com.mirrorseek.method;

public class Demo5MethodSame {
    public static void main(String[] args) {
        isSame(90, 9);
        System.out.println(isSameNum(90,90));
        System.out.println(isSameNum(90,9));
    }

    public static void isSame(int a, int b) {
        if (a == b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isSameNum(int a, int b) {
//        boolean same;
//        if (a == b) {
//            same = true;
//        }else {
//            same = false;
//        }
//        same = a == b ? true : false;
//        same = a == b;

        return a == b;
//
//        return same;
    }
}
