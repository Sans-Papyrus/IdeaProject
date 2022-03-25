package com.mirrorseek.array;

/*
* 动态初始化(指定长度)：在创建数组的时候，直接指定数组当中的数据元素个数
* 静态数组的创建(指定内容)：在创建数组的时候，不直接指定数据个数的多少，而是将具体的数据内容进行指定
*
* 静态数组初始化基本格式：
* 数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, ...};
*
* 注意事项：
* 虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素具体内容，也可以自动推算出来。
* */
public class StaticArray {
    public static void main(String[] args) {
        int[] arrayA = new int[] {1, 5, 5, 8};
        int count = 0;
        /*创建一个数组, 里面存放字符串*/
        String[] arrayC = new String[] {"Hello", "Java", "YYDS"};
        /*通过下标访问数组内容*/
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA[3]);

        /*通过下标访问数组*/
        System.out.println(arrayC[1]);

        /*数组的遍历*/
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i]+ " ");
        }
    }
}
