package com.mirrorseek.array;

public class ArrayMin {
    public static void main(String[] args) {
        int[] array = {1, 5 , 4, 40, 78, 8, 89, 7878};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }

}

