package com.company.day8;

public class Account {
    private int id;//账号
    protected double balance;//余额
    private double annualInterestRate;//年利率

    public  Account(){

    }
    public Account(int id, double balance, double annualInterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //返回月利率
    public double getMonthlyInterest(){
        return this.annualInterestRate / 12;
    }
    //取款
    public void withdraw(double amoubnt) {
        if (this.balance >= amoubnt) {
            balance -= amoubnt;
            System.out.println("取出金额为：" + amoubnt);
        } else {
            System.out.println("余额不足");
        }
    }
        //存款
        public void deposit ( double amount){
            balance += amount;
        }
    }
