package com.company.day2;

public class wanshu {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <1000 ; i++) {
            for (int j = 1; j <i ; j++) {
                if ( i % j ==0){
                     sum +=j;
                }

               }
            if (sum == i){
                System.out.println(i);
            }sum = 0;
        }
    }
}
