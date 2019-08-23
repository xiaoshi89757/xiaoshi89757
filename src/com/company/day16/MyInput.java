package com.company.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput {
    public String nextString(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String str = null;
        try {
             str = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
    public int Integer(){
        return Integer.parseInt(nextString());
    }
    public boolean nextBoolean(){
        return Boolean.parseBoolean(nextString());
    }

    public static void main(String[] args) {
        MyInput mi = new MyInput();
        System.out.println("请输入一个字符串");
        String str = mi.nextString();
        System.out.println(str);
        int j = mi.Integer();
        System.out.println(j);
        boolean b = mi.nextBoolean();
        System.out.println(b);
    }
}
