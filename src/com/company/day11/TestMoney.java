package com.company.day11;
import java.util.Scanner;

public class TestMoney {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("李雷",1001,new MyDate(1998,12,21),8800);
        emps[1] = new HourlyEmployee("韩梅梅",1002,new MyDate(1987,4,30),100,6);
        System.out.println(emps[0].eamings());
        Scanner s = new Scanner(System.in);
        System.out.println("请输入本月的月份：");
        int month = s.nextInt();
        for (int i = 0; i <emps.length; i++) {
            if (month == emps[i].getBirthday().getMonth()) {
                System.out.println(emps[i]);
                System.out.print("------");
                System.out.println("加工资");
            }
            System.out.println(emps[i]);
        }
    }

}
class SalariedEmployee extends Employee{
    private double monthlySalary;
    @Override
    public double eamings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }



    @Override
    public String toString() {
        return "SalariedEmployee"+super.toString() +"monthlySalary" + monthlySalary;
    }
}
 abstract class Employee{
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double eamings();

}
class MyDate{
    private int year;
    private int month;
    private int day;


    public MyDate(int year, int day, int month) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public MyDate() {
    }
    public String toDateString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
 class HourlyEmployee extends Employee{
     private double wage;//每小时工资
     private double hour;
     @Override
     public double eamings() {
         return this.wage * this.hour;
     }

     public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
         super(name, number, birthday);
         this.wage = wage;
         this.hour = hour;
     }



     @Override
     public String toString() {
         return "HourlyEmployee"+"wage =" + wage + "hour"+ hour+super.toString();
     }

 }
