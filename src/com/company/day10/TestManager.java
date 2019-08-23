package com.company.day10;

public class TestManager {
    public static void main(String[] args) {
        CommonEmployee c = new CommonEmployee();
        c.work();

        Manager m = new Manager();
        m.work();
    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;//薪水

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee{
    private double bonus;//奖金
    public void work(){
        System.out.println("人工作");
    }

    public Manager(){

    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
class CommonEmployee extends Employee{
    private double bonus;
    public void work(){
        System.out.println("高级工作");
    }
}