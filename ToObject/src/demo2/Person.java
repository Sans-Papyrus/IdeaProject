package demo2;

/*
*一旦使用了private进行修饰，只能在本类中可以访问
* 如果超出了本类的返回则无法直接访问
*
* 间接访问private成员变量，就是定义一对儿Getter/Setter方法
*
* 必须叫setXxx或者是getXxx命名规则
* 对于Getter来说，不能有返回值，参数类型和成员变量对应
* 对于Setter来说，不能有参数，返回值类型和成员变量对应
*
* */
public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫" + name + "今年" + age + "岁");
    }

    /*这个成员方法专门用于向age设置数据*/
    public void setAge(int num) {
        if (num < 100 && num > 0) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }

    }

    /*这个成员方法专门用于获取age的数据*/
    public int getAge() {
        return age;
    }
}
