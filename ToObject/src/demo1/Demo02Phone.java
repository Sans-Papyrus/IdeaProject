package demo1;

public class Demo02Phone {
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


        System.out.println("==========");

        /*根据Phone类创建一个名为two的对象*/
        /*格式：类名称 对象名 = new 类名称();*/
        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("=============");

        two.brand = "三星";
        two.price = 5999.99;
        two.color = "黑色";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        /*调用成员方法*/

        two.call("棒子");
        two.sendMessage();

    }
}
