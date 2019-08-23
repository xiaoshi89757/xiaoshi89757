package com.company.day19;

@com.company.day19.MyAnnotation(value = "guanshuai")
public class Person extends Creature<String> implements Comparable, MyInterface {
    public  String name;
    private int age;
    public int id;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @MyAnnotation(value = "abc123")
    public void show(){
        System.out.println("我是一个人");
    }
    public void display(String nation) throws Exception{
        System.out.println("我的国家是" + nation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    class Bird{

    }
    public static void info(){
        System.out.println("中国人");
    }
}
