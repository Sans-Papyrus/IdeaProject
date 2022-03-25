package com.mirrorseek.array;
/*
* 求出数组中的最大值
* */
public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 5 , 4, 40, 78, 8, 89, 7878};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
