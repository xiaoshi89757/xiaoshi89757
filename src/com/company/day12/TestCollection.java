package com.company.day12;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

/*
* 存储对象可以考虑：1.数组  2.集合
* 存储对象的特点 Student[] stu = new Student[20];
*   >弊端：1.一旦创建长度不可变 2.真实的数组存放的对象的个数是不可加的
* */
public class TestCollection {
    public static void main(String[] args) {
    TestCollection1();

    }
    public static void TestCollection1(){
        Collection coll = new ArrayList();
        //1.size(); 返回集合元素的个数
        System.out.println(coll.size());
        //2.add(Object obj) 向集合中添加元素
        coll.add(123);
        coll.add("aa");
        System.out.println(coll.size());
        //3.addAll(Collection coll) 将形参coll中包含的所有元素加到当前集合中
        //Collection coll1 = new TestList(1);
//        coll1.addAll(coll1);
//        System.out.println(coll1.size());
        //4.isEmpty();
        //5.clear(); 清空集合元素
        //6.查看集合元素
        System.out.println(coll);
        //7.contains(Object obj) 判断集合中是否包含指定的obj元素 包含返回true
        //判断的依据就是元素所在的类的equals()方法进行判断
        //如果明确存入集合中的元素是自定义的对象 要求 自定义类要重写equals()方法
        boolean b1 = coll.contains(123);
        System.out.println(b1);
        System.out.println("-------------------------");
        System.out.println(coll.hashCode());
        //8.containsAll(Collection coll);
        Collection coll1= new ArrayList();
        coll1.add(123);
        coll1.add(new String("AA"));
        boolean b3 = coll.containsAll(coll1);
        System.out.println(b3);
        //8.retainAll(Collection coll) 两个集合的所有交集 共有的元素 返回给当前集合coll
        coll.retainAll(coll1);
        System.out.println(coll);
        //9.remove(Object obj) 删除集合中的obj元素 若删除成功返回true 否则返回false
        boolean b2 = coll.remove("BB");
        System.out.println(b2);
        //10.removeAll(Collection coll) 从当前集合中删除两个集合的交集
        //toArray() 将集合转成为数组
        //11.iterator();返回一个Iterator接口实现类的对象 实现集合的遍历
        Iterator iterator = coll.iterator();
       /* 1.不用
       System.out.println(iterator.next());
        System.out.println(iterator.next());
        2.不用
        for (int i = 0; i <coll.size() ; i++) {
            System.out.println(iterator.next());
        }*/
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.next()输出下一位 并且指针下移一位
        }
   /* while ((iterator.next())!= null){
        System.out.println(iterator.next());
    }
    报错 java.util.noSuchElementExc
    */

    }
}
