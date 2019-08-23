package com.company.day2;

public class zhishu {
    public static void main(String[] args) {
        l:
        for (int i = 2; i <100 ; i++) {
            for (int j = 2; j <Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    continue l;
                }



            }System.out.println(i);
        }
    }
}
