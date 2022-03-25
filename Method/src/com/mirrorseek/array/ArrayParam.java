package com.mirrorseek.array;

/*
* 定义一个方法输出数组中的元素
* 数组作为方法参数，传递地址
* 当调用方法的时候，向小括号中进行传参，传递进去的参数其实是数组的地址值
* */
public class ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 45, 45, 45, 45, 77, 89, 78};
        System.out.println(array); //地址值
        printArray(array); //传递进去的就是array中保存的地址值
    }

    /*
    * 三要素
    * 返回值类型，只需要进行打印输出，没有返回值，不需要计算，所以数据类型为void
    * 方法名称printArray
    * 参数列表 数组 int[] array
    * */
    public static void printArray(int[] array) {
        System.out.println("printArray方法收到的参数是:" + array); //地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
