package demo1;

/*
* 一般情况下
* 1. 导包
* import package.classname;
* import 包名称.类名称、
*
* 2. 创建，格式：
* 类名称 对象名 = new 类名称();
* Student stu = new Student();
*
* 3. 使用
* 使用成员变量，对象名.成员变量名;
* 使用成员方法，对象名.成员方法名();
*
* 注意事项:
* 如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样
* 如果要使用的类在同一个包中，可以不用进行导包操作
* */
public class Demo01Student {
    public static void main(String[] args) {
        /*创建对象: 根据Student类, 创建了一个stu对象*/
        Student stu = new Student();
        System.out.println(stu.name); //null 引用类型默认值
        System.out.println(stu.age); //0 整数类型默认值

        System.out.println("=============");

        /*将右侧的字符串，赋值交给stu对象中的name成员变量*/
        stu.name = "张三";
        /*将右侧的数值，赋值交给stu对象中的age成员变量*/
        stu.age = 19;
        System.out.println(stu.name);
        System.out.println(stu.age);

        /*使用对象的成员方法 格式:对象名.方法名();*/
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
