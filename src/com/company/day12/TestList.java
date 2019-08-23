package com.company.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        /*
        * ArrayList list的主要实现类
        * LinkedList对于频繁的插入 删除操作
        * Vector 古老的实现类 线程安全
        * list相对于collection新增加的方法
        *
        * void add(int index , Object ele) 在指定的索引位置index添加元素
        * boolean addAll(int index .Collection eles)
        * Object get (index)  获取指定索引的元素
        * int  indexOf(Object obj) 返回obj在集合中首次出现的位置 没有的话返回-1
        * int lastIndexOf(Object obj) 返回obj在集合中最后一次出现的位置 没有的话返回-1
        * Object remove(int index) 删除指定索引位置的元素
        * Object set(int index ,Object ele) 设置指定索引位置的元素的ele
        * List subList(int fromIndex ,int toIndex) 返回从fromIndex 到toIndex的一个子list
        * 左闭右开 包含左面不包含右面
        *
        *  list常用的方法 ：增 add() 删 remove 改 set（int index Object obj） 查 get（index）
        *  插 add(int index ,Object obj) 长度 size
        */
        List list = new ArrayList( );
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("GG");
        System.out.println(list);
        /*Iterator iterator =  list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());}*/

        list.add(2,"AAA");
        System.out.println(list);
        System.out.println(list.indexOf(456));
        }
    }

