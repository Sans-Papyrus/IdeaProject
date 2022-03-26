package demo1;

/*当一个对象作为参数时，传递到方法当中时，实际上传递进去的是对象的地址值*/
public class PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 7999.9;
        one.color = "黑色";
        phone(one); //传递进去的参数是地址值

    }

    public static void phone(Phone param) {
        System.out.println(param.brand); //苹果
        System.out.println(param.price); //7999.9
        System.out.println(param.color); //黑色
    }
}
