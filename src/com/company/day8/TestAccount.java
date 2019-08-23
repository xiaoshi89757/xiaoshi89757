package com.company.day8;

public class TestAccount {
    public static void main(String[] args) {
        Account acct = new Account(1112,20000,0.045);
        acct.withdraw(30000);
        System.out.println("当前余额为："+ acct.getBalance());
        acct.withdraw(2500);
        acct.deposit(3000);
        System.out.println("当前余额为：" + acct.getBalance());
        System.out.println("月利率为" + acct.getMonthlyInterest());
    }
}
