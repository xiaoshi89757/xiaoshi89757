package com.company.day9;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("abc",2000);
        System.out.println(a1.toString());
    }
}
class Account{
    private int id;//账号
    private String passwd;//密码
    private double balance;//余额
    private static double rate = 0.05;//利率
    private static double minBlance = 1;//最小余额
    private static int init =1000;

    public Account(String passwd, double balance) {
        this.id = init++;
        this.passwd = passwd;
        this.balance = balance;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinBlance() {
        return minBlance;
    }

    public static void setMinBlance(double minBlance) {
        Account.minBlance = minBlance;
    }
}