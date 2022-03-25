package com.mirrorseek.array;
/*
* 所有的引用类型变量，都可以赋值一个null值，但是代表其中什么都没有。
* */
public class ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
//        array = new int[3];
        System.out.println(array[0]);//空指针异常
    }
}
