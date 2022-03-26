package demo1;
/*
*
* 成员变量（属性）：
*   String brand; //品牌
*   double price; //价格
*   String color; //颜色
*
* 成员方法（行为）：
* public void call(String who) {} //打电话
* public void sendMessage() {} // 群发短信
*
* */
public class Phone {

    /*成员变量*/
    String brand; //品牌
    double price; //价格
    String color; //颜色

    /*成员方法*/
    public void call(String who) {
        System.out.println("call" + " " + who);
    }

    public void sendMessage(){
        System.out.println("Send to all.");
    }
}
