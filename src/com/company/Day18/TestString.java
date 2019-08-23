package com.company.Day18;

import org.junit.Test;

public class TestString {
    /*
    * 字符串与基本数据类型，包装类之间的转换
    * 1.字符串 ---> 基本数据类型，包装类 调用相应的parseXxx(String str)方法
    * 2.基本数据类型，包装类 --->字符串 调用字符串重载的ValueOf()
    *
    * 字符串与字节数组间的转换
    * 1.字符串 ---> 字节数组：调用字符串的getBytes()
    * 2.字节数组 ---> 字符串 ：调用字符串的构造器
    *
    * 字符串与字符数组间的转换
    * 1.字符串 ---> 字符数组 调用字符串的toCharArray()
    * 2.字符数组 ---> 字符串：调用字符串的构造器
     * */
    @Test
    public void test5(){
        String str1 = "123";
        int i = Integer.parseInt(str1);
        System.out.println(i);
        String str2 = "1234abc";
        byte[] b = str2.getBytes();
        for (int j = 0; j <str2.length(); j++) {
            System.out.print((char) b[j]);
        }
    }
    /*
    * public String substring(int startpoint)
    * public String substring(int start,int end) 返回从start开始到end结束的一个左闭右开的字符串
    * public String replace(char oldChar, char newChar) 更换字符串所有的oldChar变更为newChar
    * public String replaceAll(String old, String new)
    * public String trim() 去除当前字符串前后空格 不能去除中间的空格
    * public String concat(String str) 链接当前的字符串和str
    * public String[] split(String regex)   按照regex将当前字符串拆分 拆分为多个字符串 整体返回值组成String数组
    * public char[] toCharArray() 将字符串以char[]数组的形式返回
    * */
    @Test
    public void test3(){
        String str1 = "青岛吴彦祖青岛";
        String str2 = "上海吴彦祖A";
        String str3 = str1.substring(2);
        String str4 = str2.substring(2,5);
        System.out.println(str3);
        System.out.println(str4);

    }
   /* public int length();
    public char charAt(int index); 下标为index位置的字符串以字符输出
    public boolean equals(Object anObject);判断两个字符串是否相等 相等的话返回true
    public int compareTo(String antherString); 比较两个字符串的字符序列 a<b
    str1 >str2 返回正数 str1=str2 返回0   str1 < str2 返回负数
    public int indexOf(String s); 返回s字符串在当前字符串首次出现的位置 若没有返回-1
    public int indexOf(String s ,int startpoint);返回s字符串在startpoint到末尾的位置    若没有返回-1
    public int lastIndexOf(String s); 返回s字符串在当前字符串最后一次出现的位置 若没有返回-1
    public int lastIndexOf(String s ,int startpoint);返回s字符串在startpoint到末尾的位置
    public boolean startWith(String prefix); 判断当前字符串是否以prefix开始
    public boolean endsWith(String suffix); 判断当前字符串是否以suffix结束
    public boolean regionMatches(int firstStart, String other,int otherStart, int length )
    判断当前字符串从firstStart开始的子串与另一个字符串otherStart开始,length长度的字符串是否equals*/
    @Test
    public void test2(){
        String str = new String("abcdefg");
        String str1 = new String("abddefg");
        int  i = str.length();
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.equals(str1));
        System.out.println(str.compareTo(str1));
        System.out.println(str.lastIndexOf("d"));
        System.out.println(str1.lastIndexOf("d", 1));
    }
    /*
    * String:代表不可变的字符序列 底层使用char[]存放
    * String是final的 不可继承
    *
    * */
    @Test
    public void test1(){
        String str1 = "JavaEE";
        String str2 = "JavaEE";
        String str3 = new String("JavaEE");
        String str4 = "JavaEE"+"Android";
        String str5 = "Android";
        String str6 = str1+str5;
        str5 = str5 + "Handoop";
        System.out.println(str1 ==str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


        System.out.println(str4 ==str6);
        System.out.println(str4.equals(str6));

    }
}
