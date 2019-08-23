package com.company.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestCollections {
    /*
    * 操作Collection Map集合的工具类 Collections
    *
    * Collection 是一个接口 存储数据可以用list 和set 子接口
    *
    * */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(12);
        list.add(78);
        System.out.println( list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
