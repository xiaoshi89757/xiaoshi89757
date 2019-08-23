package com.company.day8;

public class TestEquals {
    public static void main(String[] args) {
        /*equals();
        //只能处理引用类型变量，在object类中，发现equals()也是比较两个地址值是否相等
          默认调用Object里面的方法
          public boolean equals(Object obj){
          return ( this == obj);
          }
          String 中的equals重写了 比较的是中间的值
          String 包装类 file类 date类 重写了object类的equals()方法，比较的是
          实体内容是否相同
          */
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.equals(p2));

    }
}
class test1{

    /*
     * 1.基本数据类型，根据基本数据类型的值判断是否相等，相等返回true，相反返回flase
     *  两边的数据类型可以不同，在不同的情况下也可以返回"true"
     * 2.引用数据类型:比较引用类型变量的地址值是否相等
     * */
//    int i = 12;
//    int j = 12;
//        System.out.println( i == j);
//    Object o1 = new Object();
//    Object o2 = new Object();
//        System.out.println(o1);
//        System.out.println(o2);
}