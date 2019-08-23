package com.company.day17;
class Customer implements Runnable{
    private Account account = null;

    public Customer() {
    }

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

            for (int i = 0; i < 3; i++) {
                account.AddAccount(1000);
            }

    }
}
class Account{
    public int money; //存钱
    public Account(int money){
        this.money = money;
        System.out.println("账户余额为 ：" + money);
    }
    public synchronized void AddAccount(int money){
        this.money = this.money + money;
        System.out.println(Thread.currentThread().getName() + "存钱：" + money);
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("账户余额为" +"\t"+this.money);
    }
}
public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account(0);
        Customer c = new Customer(a);
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
