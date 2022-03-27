package standardclass;

/*
* 一个标准的类通常要由以下四部分组成
*
* 1. 所有的成员变量都要使用private进行修饰
* 2. 编写一个无参的构造方法
* 3. 编写一个全参的构造方法
* 4. 为每一个成员变量写上Getter/Setter方法
*
* 这样的标准类也加Java Bean
* */

public class Student {

    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
