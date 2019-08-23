package com.company.day4;

public class test1 {
    public static void main(String[] args) {
        test2 t = new test2();
        t.mOL(5);

    }
}
 class test2 {
            public void mOL(int i) {
                System.out.println(i * i);
            }

            public void mOL(int i, int j) {
                System.out.println(i * j);
            }

            public void mOL(String str) {
                System.out.println(str);
            }
        }

