package com.company.day4;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "guanguan";
        c1.info();

    }
}
class Factory{
    //制造车
    public Car produceCar(){
        return new Car();
    }
    public Car produceCar(String n ,int w ){
        Car c2 = new Car();
        c2.name = n;
        c2.wheel = w;
        return c2;
    }
}
class Car{
    //1.属性
    String name;
    int wheel;

    //2.方法
    public void info(){
        System.out.println("name:" + name + "wheel:" + wheel);
    }
    public void show(){
        System.out.println("我是一辆车");
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setWheel(int w) {
        wheel = w;
    }
}