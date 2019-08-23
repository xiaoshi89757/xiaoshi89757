package com.company.day3;

public class TestPritimive {
    public static void main(String[] args) {
        //创建Pritimive的对象d
        Pritimive d = new Pritimive();
        //遍历
        for (int i = 0; i <d.t.length ; i++) {
            System.out.println(d.t[i]);
        }
        //给d的元素重新赋值
        d.t[0] = true;
        d.t[1] = true;
        d.t[2] = true;
        for (int i = 0; i <d.t.length ; i++) {
            System.out.println(d.t[i]);
        }
        }

    }
        class Pritimive {
            boolean[] t = new boolean[3];
        }