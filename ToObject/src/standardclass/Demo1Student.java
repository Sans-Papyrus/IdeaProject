package standardclass;

public class Demo1Student {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setAge(28);
        student1.setName("张三");

        System.out.println("姓名：" + student1.getName() + " " + "年龄：" + student1.getAge());

    }
}
