package demo1;

/*两个引用指向同一个对象*/
public class Demo03PhoneSame {
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


        System.out.println("=============");

        /*将one对象赋值给two*/
        Phone two = one;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("=============");

        two.brand = "三星";
        two.price = 4549.88;
        two.color = "Blue";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        /*调用成员方法*/

        two.call("BANG");
        two.sendMessage();

    }
}
