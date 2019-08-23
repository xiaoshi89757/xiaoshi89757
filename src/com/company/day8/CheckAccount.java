package com.company.day8;

public class CheckAccount extends Account {
    private double overdraft;//可透支限额

    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amoubnt) {
        if (amoubnt <= balance){
            balance -= amoubnt;
            System.out.println("取款成功");
        }else if (overdraft >= amoubnt - balance){
            overdraft -=(amoubnt -balance);
            balance =0;
            }else{
            System.out.println("超出限额");
        }

    }
}
