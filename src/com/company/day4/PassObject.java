package com.company.day4;
/*匿名类对象：创建类的对象是匿名
1）当我们只需要调用一次类的对象时，我们可以考虑使用匿名的方式创建类的对象
2）创建的匿名类的对象只能调用一次
* */

class Circle{
    double radius;
    public double findArea(){
        return Math.PI * radius *radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return  radius;
    }
}
public class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Radius" + "\t\t" + "Area");
        int temp = 0;
        for (int i = 1; i <= time; i++,temp = i) {
            c.setRadius(temp);
            System.out.println(c.getRadius() + "\t\t" + c.findArea());
        }
    }
    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle(); //半径为0

        p.printAreas(c,5);
        System.out.println("now radius is "+ c.getRadius());
        System.out.println();
        p.printAreas(new Circle(), 6);
        System.out.println("now radius is "+ c.getRadius());
    }
}


