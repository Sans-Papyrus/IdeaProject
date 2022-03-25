package com.mirrorseek.array;

/*
* 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
* 整数类型：默认值：0
* 浮点类型：默认值：0.0
* 字符类型：默认值：'\u0000'
* 布尔类型：默认值：false
* 引用类型：默认值：null
*
* 注意事项：
* 静态初始化其实也有默认值的过程，
* */
public class ArrayUse1 {
    public static void main(String[] args) {
        /*动态初始化一个数组*/
        int[] arrayA = new int[3];
        System.out.println(arrayA); //内存地址值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println("=========");

        /*将数值111复制给数组当中的1号元素*/
        arrayA[1] = 111;

        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);


    }
}
