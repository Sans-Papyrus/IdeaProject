package com.mirrorseek.method;

/*
 * 定义方法的完整格式
 * 修饰符 返回值类型 方法名称 (参数类型, 参数名称, ...){
 *   方法体
 *   return  返回值
 * }
 *
 * 方法的三种调用格式
 * 1. 单独调用：方法名称(参数);
 * 2. 打印调用
 * 3. 赋值调用
 *
 * 返回值类型为void 只能进行单独调用和打印调用, 不能进行赋值调用
 * */
public class Demo2MethodDefine {
    public static void main(String[] args) {
        // 单独调用
        sum(10, 20);
        // 赋值调用
        int result = sum(90, 90);
        result += 100;
        System.out.println(result);
        // 打印调用
        System.out.println(sum(10, 100));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}


