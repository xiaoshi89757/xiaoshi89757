package com.company.day9;

public class TestCircle {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(2.1);
        System.out.println(Circle1.getTotal());

    }
}
class Circle1{
    private double radius;
    private  static String info = "我是一个圆";
    private static int total =0;


    public Circle1(double radius) {
        this.radius = radius;
        total ++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static String getInfo() {
        return info;
    }

    public static void setInfo(String info) {
        Circle1.info = info;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle1.total = total;
    }
    public static void show(){
        System.out.println(info);
    }
    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                '}';
    }
}