package com.company.day12;

public class TestCircle {
    public static void main(String[] args) {

    }
}
class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int compareTo(Object obj)throws Exception{
        if(this == obj){
            return 0;
        }else if (obj instanceof Circle){
            Circle c = (Circle)obj;
            if (this.radius > c.radius){
                return 1;
            }else if (this.radius == c.radius){
                return 0;
            }else {
                return -1;
            }
        }else{
          throw new MyException("传入类型有误");
            // throw new Exception("传入的类型有误");
        }
    }
}