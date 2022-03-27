package demo2;

public class Demo1Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("小灰灰");
        stu.setMale(false);

        System.out.println("姓名:" + stu.getName());
        System.out.println("年龄:" + stu.getAge());
        System.out.println("是不是爷们儿:" + stu.isMale());
    }
}
