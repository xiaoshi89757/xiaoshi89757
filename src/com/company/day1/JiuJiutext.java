package com.company.day1;

public class JiuJiutext {
    public static void main(String []args){
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                int m = j*i;
                System.out.print(j + "*" +i + "=" + m + "\t");

            }
            System.out.println();
        }

    }
}
