package demo2;

/*
* 面向对象的三大特征：封装，多态，继承
* 1. 方法就是一种封装
* 2. 关键字private也是一种封装
*
* 封装就是将一些细节信息隐藏起来，对于外界不可见
* */
public class Demo1Method {
    public static void main(String[] args) {
        int[] array = {10, 80, 7878, 11, 55, 89, 100, 78, 564};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
