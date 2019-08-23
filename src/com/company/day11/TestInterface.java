package com.company.day11;
/*
* 接口（interface）是和类并行的一个概念
* 1.接口可以看做一个特殊的抽象类，是常量与抽象方法的一个集合 不能包含变量、一般的方法
* 2.接口不能实例化 不能有构造器
* 3.接口定义的就是一种功能，可以被类实现 （implements）
* 4.实现接口的类，必须要重写其中的所有的抽象方法，才可以实例化，若没有重写所有的抽象方法，
* 那么还是一个抽象类
* 5.类可以实现多个接口
* 6.接口与接口之间的关系也是继承的关系 类之间是单继承 接口可以多继承
* */
public class TestInterface {
    public static void main(String[] args) {
        B3 b =new B3();
        b.method1();
    }
}
interface A3{
    //常量 所有的常量默认用 public static final
    public static final int I = 12;
    public static final boolean F = false;

    //抽象方法 所有的都用public abstract
    void method1();
    void method2();
}
class B3 implements A3,D4{

    @Override
    public void method1() {
        System.out.println("guanguan");
    }

    @Override
    public void method2() {

    }

    @Override
    public void test() {

    }
}
abstract class C3 implements A3{

        }
interface D4{
    void test();
}
interface E5 extends D4{
    void dest();
}
class test3 implements E5{
    @Override
    public void dest() {

    }

    @Override
    public void test() {

    }
}


