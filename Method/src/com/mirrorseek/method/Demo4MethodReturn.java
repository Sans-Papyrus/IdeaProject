package com.mirrorseek.method;
/*
*注意事项
* 有返回值：可以使用单独调用, 打印调用, 赋值调用
* 无返回值：只能使用单独调用, 打印调用
* */
public class Demo4MethodReturn {
    public static void main(String[] args) {
        getSum(19 ,89);
        int num = printSum(19, 88);
        System.out.println("结果是: " + num);
    }

    /*
    * 无返回值
    * */
    public static void getSum(int a, int b){
        int result = a + b;
        System.out.println("结果是: " + result);
    }

    /*
    * 有返回值
    * */
    public static int printSum(int a, int b) {
       return a + b;
    }
}
