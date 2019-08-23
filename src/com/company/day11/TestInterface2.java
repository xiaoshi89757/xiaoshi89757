package com.company.day11;

public class TestInterface2 {
    public static void main(String[] args) {
        ComparebleCircle c1 = new ComparebleCircle(2.3);
        ComparebleCircle c2 = new ComparebleCircle(2.1);
//       int i1= c2.compareTo(c1);
//        System.out.println(i1);
//        System.out.println(c2.compareTo(c1));
   }
}
interface CompareObject{
     int compareTo(Object o);
}
class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
}
class ComparebleCircle extends Circle implements CompareObject{
    public ComparebleCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
    }else if(o instanceof CompareObject){
            ComparebleCircle c = (ComparebleCircle) o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if (this.getRadius() < c.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }else{
            throw new RuntimeException("传入的非ComparebleCircle对象 不可进行比较");
        }
    }
}