package com.company.day11;

public class TestInnerClass1 {

}
class OuterClass {
    //下面的方法用的较少
    public void method1() {

        class InnerClass {
        }
    }
    //常常使用一个方法，使其返回值为某各类或者接口的对象 而这类或接口在方法内部创建
    public Comparable getComparable(){
        //创建一个实现Comparable 接口的类
        class Mycomparable implements  Comparable{
            @Override
            public int compareTo(java.lang.Object o) {
                return 0;
            }
        }
        return new Mycomparable();
    }

}