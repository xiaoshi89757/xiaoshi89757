package com.company.day2;

public class TestArray {
    public static void main(String[] args){

        String[] names;
        int [] scores;
        names = new String []{"管","清","翰"};
        //动态初始化
        scores = new int [4];
        scores[0] = 87;
        scores[3] = 77;
        /*
        * 数组的长度，length
        * System.out.println(names.length);
        * */
        System.out.println(names.length);
        System.out.println(scores.length);
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
    }
}
