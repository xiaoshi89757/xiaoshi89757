package com.company.day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args)  {
       /* Properties pros = new Properties();
        pros.load(new FileInputStream(new File("jdbc.properties")));
        String s = pros.getProperty("name");
        System.out.println(s);*/
        /*
        * 向HashMap 中添加元素时，会调用key所在类的equals方法 若两个key相同
        * 只能添加进后面添加的那个元素
        * */
        Map map = new TreeMap();
        map.put("3b", "abv");
        map.put("3a", "abg");
        System.out.println(map.size());
        /*
        * 如何遍历map
        *  Set keySet()
        *  Collection values()
        *  Set entrySet
        * */
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
