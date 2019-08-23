package com.company.day1;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag = false;
        long  start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {

            for (int j = 2; j < Math.sqrt(i); j++) {
                    if(i % j ==0){
                  flag = true;
                  break;
                }
            }
            if (flag  == false ){
                System.out.println(i);
            }
            flag = false;
           }
           long end = System.currentTimeMillis();
        System.out.println(end - start);
        }
    }


