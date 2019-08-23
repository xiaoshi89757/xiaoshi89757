package com.company.day11;
/*
* 内部类的分类：成员内部类（声明在类内部且方法外的） 、 局部内部类（声明在方法里面的）
* 成员内部类：
*   是外部类的一个成员：可以有修饰符（public private protected 缺省）.static.final 可以调用外部类的属性
*   具有类的特点：abstract 可以类里面定义属性方法构造器
* 局部内部类：
*
*  内部类：（注意三点）
*  1.如果创建成员内部类的对象
*  2.如果区分调用外部类、内部类的变量
*  3.局部内部类的使用
* */
public class TestInnerClass {
    public static void main(String[] args) {
        //创建静态内部类的对象，可以直接通过外部类调用静态内部类的构造器
        Person.Dog d = new Person.Dog();
        //创建非静态内部类的对象 必须先创建外部类的对象 通过外部类的对象调用内部类的构造器
        Person p = new Person();
        Person.Bird b =  p.new Bird();
        b.info();
        b.setName("han");
    }
}
class Person{
    String name ="管";
    int age;
    class Bird{
        String name = "帅";
        int id ;
        public void setName(String name) {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }

        public Bird() {
        }
        public void info(){
            show();
        }
    }
    static class Dog{
        public void info(){

        }
    }
    public void show(){
        System.out.println("show()方法");
    }
    public void method1(){
        class A{

        }
    }
}
