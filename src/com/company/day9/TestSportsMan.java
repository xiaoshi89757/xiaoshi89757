package com.company.day9;
/*
* 1.随着类的加载儿加载 在内存中独一份
* 2.可以通过类.类方法方式调用，
* static
* 1.内部可以调用静态的属性或者静态的方法，不能调用非静态的属性或方法，反之，
* 非静态的方法可以调用静态的属性和方法
*
* 静态的结构（static 的属性、方法、代码块、内部类）的生命周期要早于非静态的结构，
* 同时被回收要晚于非静态的结构
* */
public class TestSportsMan {
    public static void main(String[] args) {
        SportMan s1 = new SportMan("王一",22);
        s1.name = "花";
        System.out.println(s1.toString());
    }

}
class SportMan{

    String name;
    int age;
    static String nation;


    public SportMan(String name, int age) {
        this.name = name;
        this.age = age;
        this.nation = "中国";
    }

    @Override
    public String toString() {
        return "SportMan{" +
                "name='" + name + '\'' +
                ", age=" + age +  '\''+"，nation=" + nation +
                '}';
    }

    public static void show(){
        System.out.println(nation);
    }
}