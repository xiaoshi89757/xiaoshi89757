package com.java.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
* java 内置的函数式接口
*       消费型接口Consumer<>     void accept( T t)
*       供给型接口Supplier<> T   get()
*       函数型接口Function<T,R>  R apply(T t)
*       断定型接口Predicate<T>   boolean test(T t)
* */
public class LanbdaTest2 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = integer -> System.out.println("崔老板消费起来");
    }

    @Test
    public void test1() {
        happyTime(500,money -> System.out.println("崔老板去发廊吃了个快餐"));
    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
}
    //根据给定的规则，过滤集合中的字符串
    public List<String> filterString(List<String> list , Predicate<String> pre){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s :list){
            if (pre.test(s)){
                arrayList.add(s);
            }
        }
        return arrayList;
    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","南京","天津");
        List<String> arrayList = filterString(list,s -> s.contains("京"));
        System.out.println(arrayList);

    }

}
