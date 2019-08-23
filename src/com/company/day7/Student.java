package com.company.day7;

/*
* 1>继承性： class A extends B
* 子类A 父类B（或基类 Super class）
* 2>子类继承父类之后就可以继承父类的方法和属性
* 3>当父类中有私有的属性和方法时，子类童颜可以获取得到，只是由于封装性的设计，使得子类不可以直接调用
* 子类除了通过继承，获取父类的结构之外，还可以定义自己特有的成分
* 4>java的继承性只支持单继承
* */
public class Student extends Person {
   /* private  String name;
    private  int age;
*/
    public Student(){

    }

    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
        this.setName(name);
        this.setAge(age);
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){
        System.out.println("走路");
    }
}
