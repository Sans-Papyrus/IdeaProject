package _this;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo2Student {
    public static void main(String[] args) {

        String name;
        int age;

        Student student = new Student(); //无参构造
        Student student1 = new Student("张", 19); //全参构造

        student1.setName("张某");
        student1.setAge(18);

        System.out.println("我叫" + student1.getName());
        System.out.println("今年" + student1.getAge() + "岁");
    }
}
