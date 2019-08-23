package com.company.day7;
/*
* 1）在构造器内部必须声明在首行
*
* */
public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle t = new TriAngle();
        t.setBase(2.3);
        t.setHeight(1.2);
        System.out.println("面积为：" + t.findArea());
    }
}
class TriAngle{ //三角形
    private double base;//长
    private double height;//高

    public TriAngle(){
        this.base = 1.0;
        this.height = 1.0;
    }

    //this(形参);可以调用当前类的重载的指定的构造器。根据形参指定调用的构造器

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return base * height /2;
    }
}