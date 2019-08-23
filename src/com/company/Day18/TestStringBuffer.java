package com.company.Day18;

import org.junit.Test;

/*
* java.lang.StringBuffer 可变的字符序列 可以对字符串内容进行增删
* java,lang,StringBuilder 可变的字符系列 是jdk5.0新加入的 线程不安全 效率要高于StringBuffer
* 添加 ：append() 删除 delete(int i ,int j) 修改 setCharAt(int index,char ch)查 charAt
* 插入 : insert(inr index, String str) 反转：reverse() 反转本身 长度 length
* replace(int startIndex ,int endIndex,String str)     substring(int start,int end)
*
*
* */
public class TestStringBuffer {
    @Test
    public void test1(){
        StringBuffer sb = new StringBuffer();
        sb.append("abc").append("123");
        System.out.println(sb.indexOf("a"));
        //StringBuffer的父类也是用数组存储 初始化默认16的容量 所以是可变的字符序列
    }
}
