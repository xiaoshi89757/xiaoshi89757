package com.company.day2;

public class test {
    public static void main(String[] args) {
       /* for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <= i ; j++) {
            int sum = i*j;
                System.out.print(i + "*" + j + "=" + sum +"\t" );
            }
            System.out.println();
        }*/
       int k = 0;
       boolean Flag = false;
        for (int i = 2; i <100 ; i++) {
            for (int j = 2; j <Math.sqrt(i) ; j++) {
                if(i % j ==0){
                   Flag = true;
                    break;
                }

                }
            if(Flag == false){
                System.out.println(i);
                k+=1;

            }Flag = false;

        }System.out.println("100内的质数个数为:"+k);

    }

}
