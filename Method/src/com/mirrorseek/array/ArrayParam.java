package com.mirrorseek.array;
/*
* 定义一个方法获取数组的长度
* */
public class ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 45, 45, 45, 45, 77, 89, 78};
        printArray(array);

    }
    /*
    * 三要素
    * 返回值类型，只需要进行打印输出，没有返回值，不需要计算，所以数据类型为void
    * 方法名称printArray
    * 参数列表 数组 int[] array
    * */

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(array[i]);
        }
    }
}
