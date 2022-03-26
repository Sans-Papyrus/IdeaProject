package demo2;

public class DemoPerson1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张家正";
//        person.age = 20; //直接访问private的内容，错误写法!!!
        person.setAge(18);
        person.show();

    }
}
