package com.mirrorseek.array;
/*
* 数组的索引编号从0开始，一直到"数组的长度-1"为止。
* */
public class ArrayIndex {
    public static void main(String[] args) {
        int[] array = {10, 56, 45};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        /*错误写法*/
/*
        System.out.println(array[3]);//数组索引越界
*/
    }
}
