package com.company.day7;

/*
* 对父类同名的方法重写
* override overwrite
* 重写规则：
* 1>子类方法“返回值类型 方法名（参数列表）”与父类的方法一样
* 2>子类方法的修饰符不能小于父类方法的修饰符
* 3>若父类方法抛异常，子类方法的抛异常不能大于父类
* 4>子父类的方法必须同为static或非static
* */
public class Cylinder extends Circle {

        private double length;
        public Cylinder() {
            length = 1;
        }

        public double getLength () {
            return length;
        }

        public void setLength ( double length){
            this.length = length;

        }
        public double findVolume () {

            return this.findArea() * length;
        }
    }
