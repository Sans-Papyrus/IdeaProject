package com.mirrorseek.array;
/*引用同一个数组*/

public class ArraySame {
    public static void main(String[] args) {
        /*动态初始化一个数组*/
        int[] arrayA = new int[3];
        System.out.println(arrayA);//内存地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        System.out.println("=========");

        arrayA[1] = 10;
        arrayA[2] = 10;
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//10

        System.out.println("===========");

        /*动态初始化一个新的数组*/
        int[] arrayB = arrayA;//将arrayA中的元素赋值给arrayB
        System.out.println(arrayB);//内存地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//10
        System.out.println(arrayB[2]);//10
        System.out.println("=========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
    }
}
