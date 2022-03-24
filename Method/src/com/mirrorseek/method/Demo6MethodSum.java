package com.mirrorseek.method;
/*
* 求出1-100之间数字的累加之和
* */
public class Demo6MethodSum {
    public static void main(String[] args) {
        System.out.println(numSum(200));
    }

    public static int numSum(int x){
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
