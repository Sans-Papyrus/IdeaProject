package demo2;
/*
* 对于基本类型当中的boolean值，Getter方法一定要写成isXxx形式，而setXxx规则不变
* */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setName(String strName) {
        name = strName;
    }

    public String getName() {
        return name;
    }

    public void setMale(boolean gender) {
        male = gender;
    }

    public boolean isMale() {
        return male;
    }

}
