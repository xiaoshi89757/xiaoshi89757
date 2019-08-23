package com.company.day9;

public class TestGeometricObject {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue",2.0,1.5);
        Circle c2 = new Circle("green",2.5,1.5);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
class GeometricObject{
        protected String color;
    protected double weight;

    protected GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if(obj instanceof Circle){
            Circle c1 = (Circle)obj;
            return this.radius == c1.radius;
        }else{
            return false;
        }
    }
    public String toString(){
        //return "radius = " + "\t" + this.radius;
        return String.valueOf(radius);
    }
    //将String类型的转成为double类型，用String.valueOf()
}
