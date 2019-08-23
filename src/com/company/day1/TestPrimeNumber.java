package com.company.day1;

public class TestPrimeNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        l :for (int i = 2; i <=10000 ; i++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if( i % j ==0){
                    continue l;
                }
            }
            System.out.println(i);

        }
        long end = System.currentTimeMillis();
        System.out.println("耗费的时间为：" +(end - start));

    }
}
