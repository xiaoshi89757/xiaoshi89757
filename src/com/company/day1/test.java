package com.company.day1;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = 1; j <i+1 ; j++) {
                int m = i * j;
                System.out.print(j + "*" + i + "=" + m +"\t");
            }
            System.out.println();
        }
    }

}
