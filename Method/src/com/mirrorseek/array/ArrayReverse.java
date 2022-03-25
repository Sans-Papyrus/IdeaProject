package com.mirrorseek.array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {78, 88, 87, 88, 99, 45, 44};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
