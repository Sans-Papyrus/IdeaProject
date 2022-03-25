package com.mirrorseek.array;
/*
* 直接打印数组名称，得到的是数组对应的内存地址哈希值
* */
public class ArrayUse {
    public static void main(String[] args) {
        /*静态初始化的省略格式*/
        int arrayA[] = {10, 65, 88, 55};

        /*直接打印数组当中元素的内容*/
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA[3]);

        System.out.println("=========");

        int num = arrayA[1];
        System.out.println(num); //65


    }
}
