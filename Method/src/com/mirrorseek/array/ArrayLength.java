package com.mirrorseek.array;

/*
 * 获取数组的长度
 * 格式
 * 数组名称.length
 *
 * 这将会得到一个int类型的数字，代表数组的长度
 *
 * 数组一旦创建，程序运行期间，长度不可改变。
 * */
public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = new int[]{4, 45, 45, 8, 7, 7, 8, 5, 11, 10};
        int arrLen = arrayB.length;
        System.out.println("arrayB数组的长度为:" + arrLen);

        System.out.println("=========");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
