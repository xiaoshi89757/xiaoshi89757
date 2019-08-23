package com.company.day7;
import java.math.*;
public class Circle {
    private double radius;
    public Circle(){
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * radius *radius;
    }
}
