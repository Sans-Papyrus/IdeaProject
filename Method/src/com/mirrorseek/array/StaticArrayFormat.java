package com.mirrorseek.array;

/*
 * 标准格式：
 * 数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, ...};
 *
 * 省略格式:
 * 数据类型[] 数组名称 = {元素1, 元素2, ...};
 *
 * 注意事项
 * 1. 静态初始化没有直接指定长度，但是仍然会自动推算得到长度
 * 2. 静态初始化标准格式可以拆分成两个步骤
 * 3. 动态初始化也可以拆分成两个步骤
 * 4. 静态初始化一旦使用省略格式，就不能拆分长两个步骤了
 * */
public class StaticArrayFormat {
    public static void main(String[] args) {
        /*省略格式的静态初始化*/
        int[] arrayA = {10, 20, 30, 40, 50};

        /*标准格式的静态初始化*/
        int[] arrayB = new int[]{10, 10, 20, 30, 45};

        /*静态初始化标准格式 拆分成两个部分*/
        int[] arrayC;
        arrayC = new int[]{45, 89, 45, 88};

        /*动态初始化标准格式 拆分成两个部分*/
        int[] arrayD;
        arrayD = new int[6];

        /*静态初始化省略格式 不可以拆分成两个部分*/
        /*以下静态数组初始化是错误写法*/
//        int[] arrayE;
//        arrayE = {10, 20, 45};
    }
}
