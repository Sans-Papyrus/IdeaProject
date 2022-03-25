package com.mirrorseek.array;

/*
*一个方法可以有0，1多个参数，但是只能有0或1个返回值，不能有多个返回值
* 如果希望有多个返回值，使用数组作为返回值类型即可
*
* 任何数据都能作为方法的参数类型，或者返回值类型
*
* 数组作为方法的参数，传递进去的其实是数组的地址值
* 数组作为方法的反返回值，返回得       其实也是数组的地址值
* */
public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(45, 45, 45);
        System.out.print("main方法接收到的返回值是:");
        System.out.println(result);//地址值
        System.out.println("总和" + result[0]);
        System.out.println("平均值" + result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数
/*        int[] array = new int[2];*/
        int[] array = {sum, avg};
        System.out.println("calculate方法内部数组是:" + array);
/*        array[0] = sum;
        array[1] = avg;*/
        return array;
    }
}
