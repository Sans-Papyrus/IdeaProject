package com.mirrorseek.method;

public class Demo10MethodOverloadPrint {
    public static void main(String[] args) {
        myPrint(10);
        myPrint("你好");
        myPrint(9.89);

    }
   public static void myPrint(byte a){
        System.out.println(a);
    }
   public static void myPrint(short a) {
        System.out.println(a);
    }
   public static void myPrint(int a) {
        System.out.println(a);
    }
   public static void myPrint(long a) {
        System.out.println(a);
    }
   public static void myPrint(float a) {
        System.out.println(a);
    }

   public static void myPrint(double a) {
        System.out.println(a);
    }

   public static void myPrint(boolean is) {
        System.out.println(is);
    }
   public static void myPrint(char c) {
        System.out.println(c);
    }
   public static void myPrint(String str) {
        System.out.println(str);
    }
}
