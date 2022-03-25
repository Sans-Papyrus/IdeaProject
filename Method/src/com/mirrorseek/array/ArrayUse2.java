package com.mirrorseek.array;

public class ArrayUse2 {
    public static void main(String[] args) {
        /*动态初始化一个数组*/
        int[] arrayA = new int[3];
        System.out.println(arrayA);//内存地址值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=========");

        arrayA[1] = 10;
        arrayA[2] = 10;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println("===========");

        /*动态初始化一个新的数组*/
        int[] arrayB = new int[3];
        System.out.println(arrayB);//内存地址值
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("=========");

        arrayB[1] = 10;
        arrayB[2] = 10;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);


    }
}
