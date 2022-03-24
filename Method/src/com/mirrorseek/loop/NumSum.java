package com.mirrorseek.loop;

public class NumSum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 100;
//        do {
//            sum += i;
//            i++;
//        }while (i <= 200);
        while (i <= 200){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
