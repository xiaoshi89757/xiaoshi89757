package com.company.day1;

public class TestWhile {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        while(i<=100){
            if(i%2 ==0){
                System.out.println(i);
                sum += i;
 
            }
            i++;
        }
        System.out.println(sum);



    }
}


