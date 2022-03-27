package _this;

/*
* 注意事项
* 1. 构造方法的名称和要和所在的类名称完全一样，就连大小写也要一样
* 2. 构造方法不要写返回值类型，就连void也不要写
* 3. 构造方法不能return一个具体地返回值
* 4. 如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法体什么也不做
* public Student() {}
* 5. 一旦编写了至少一个构造方法，那么编译器将不再赠送
* 6. 构造方法是可以重载的
* 重载规则: 方法名称相同，参数列表不同
* */

public class Student {

    /*成员变量*/
    private String name;
    private int age;

    /*无参的构造方法*/
    public Student(){
        System.out.println("无参构造方法执行了!");
    }

    /*全参的构造方法*/
    public Student(String name, int age) {
        System.out.println("全参构造方法执行了!");
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
