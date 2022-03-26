package demo2;

public class Student {
    String name;
    int age;
    boolean male;

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setName(String strName){
        name = strName;
    }

    public String getName() {
        return name;
    }

    public void setMale(boolean gender){
        male = gender;
    }
    public boolean isMale() {
        return male;
    }

}
