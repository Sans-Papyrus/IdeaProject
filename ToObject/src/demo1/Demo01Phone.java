package demo1;

public class Demo01Phone {
    public static void main(String[] args) {
        /*根据Phone类创建一个名为one的对象*/
        /*格式：类名称 对象名 = new 类名称();*/
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("=============");

        one.brand = "HUAWEI";
        one.price = 7899.99;
        one.color = "Blue";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        /*调用成员方法*/

        one.call("Jeff");
        one.sendMessage();
    }
}
