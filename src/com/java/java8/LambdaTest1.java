package com.java.java8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/*
* Lambda 表达式的使用
* 1.举例 （o1,o2） -> Integer.compare(o1,o2)
* 2.格式：
*       ->Lambda操作符 /箭头操作符
*       ->左面 Lambda的形参列表（其实就是接口中的抽象方法的形参列表）
*       ->右面 Lambda体    (其实就是重写的抽象方法的方法体)
*
* 3.Lambda表达式的使用（6种）
*       ->左面 Lambda
*
* 4.Lambda表达式的本质：作为函数式接口的实例
* 5.如果一个接口中，只声明了一个抽象方法，此接口都称为函数式接口
* */
public class LambdaTest1 {
    //语法格式一：无参，无返回值：
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };
        r1.run();
        System.out.println("**************************");
        Runnable r2 = () -> System.out.println("我爱北京");

        r2.run();

    }
    //语法格式二：Lambda需要一个参数，但是没有返回值
     @Test
    public void test2(){
         Consumer<String> con = new Consumer<String>() {
             @Override
             public void accept(String s) {
                 System.out.println(s);
             }
         };
         con.accept("华为牛逼");

         System.out.println("*********************");

         Consumer<String> con1 = (String s) -> System.out.println(s);
         con1.accept("听的人当真了");
     }
     //格式三 数据类型可以省略 因为可有编译器推断得出 称为"类型推断"
     @Test
    public void test3(){
         Consumer<String> con1 = (String s) -> System.out.println(s);
         con1.accept("听的人当真了");
         System.out.println("*********************");

         Consumer<String> con2 = ( s) -> System.out.println(s);
         con2.accept("听的人当真了");
     }
     //格式四：Lambda 只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4(){
        Consumer<String> con1 = ( s) -> System.out.println(s);
        con1.accept("听的人当真了");
        System.out.println("*********************");
        Consumer<String> con2 = s -> System.out.println(s);
    }
    //语法格式五：Lanbda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("******************");
        Comparator<Integer> com2 = (o1,o2) ->{
            System.out.println(o1);
            return o1.compareTo(o2);
        };
    }

    //语法格式六 当Lambda体只有一条语句时 return 与大括号若有 都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com2 = (o1,o2) ->{
            return o1.compareTo(o2);
        };
        System.out.println("***************");
        Comparator<Integer> com1 =(o1, o2) -> o1.compareTo(o2);

    }
}
