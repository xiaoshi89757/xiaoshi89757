package com.company.day8;

public class TestGeometric {
    public static void main(String[] args) {
        TestGeometric t = new TestGeometric();

        com.company.day8.Circle c1 = new com.company.day8.Circle("Green",2.3,1.0);
        com.company.day8.Circle c2 = new com.company.day8.Circle("Red",2.3,1.0);

        com.company.day8.MyRectangle m1 = new com.company.day8.MyRectangle("blue",2.3,3.0,2.0);
        t.displayGeomaetricObject(c2);
        t.displayGeomaetricObject(c1);
        t.displayGeomaetricObject(m1);

        boolean b = t.equalsArea(c1,m1);
        boolean c = c2.equals(c1);
        System.out.println(b);
        System.out.println(c);
    }

    public boolean equalsArea(com.company.day8.GeomaetricObject o1, com.company.day8.GeomaetricObject o2) {

        return o1.findArea() == o2.findArea();

    }

    public void displayGeomaetricObject(GeomaetricObject g) {
//        if (g instanceof Circle) {
//            Circle c = (Circle) g;
//            c.findArea();
//        }
//        if (g instanceof MyRectangle) {
//            MyRectangle m = (MyRectangle) g;
//            g.findArea();
//        }
//
        System.out.println(g.findArea());
    }
}