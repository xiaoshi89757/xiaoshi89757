package com.company.day8;

public class TestCheckAccount {
    public static void main(String[] args) {
        CheckAccount ca = new CheckAccount(1122,20000,0.045,5000);
        ca.withdraw(5000);
        System.out.println("当前余额为：" + ca.getBalance() + "可透支额为：" + ca.getOverdraft());
    }
}
