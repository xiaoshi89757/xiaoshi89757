package com.company.day8;

public class TestInstance {
    public static void main(String[] args) {
        TestInstance t = new TestInstance();
        t.method1(new Student());
    }

    public void method1(Person1 e) {

        if (e instanceof Graduate){
            Graduate g = (Graduate)e;
            g.getInfo();
            System.out.println("a graduated student");
        }
        if (e instanceof Student) {
            Student s = (Student)e;
            s.getInfo();
            System.out.println("a student");
        }
        if (e instanceof Person1) {
            System.out.println("a person");
        }

    }
}
class Person1{
        protected String name = "person";
        protected int age = 50;
        public String getInfo(){
            return "Name:"+ name +"\n" + "age:" + age;
        }
}
class Student extends Person1{
        protected String school = "pku";
        public String getInfo(){
        return "Name:"+ name + "\n" + "age:" + age + "\n" + "school:" + school;
    }
}
class Graduate extends Student{
    public String major ="IT";
    public String getInfo(){
        return "Name:"+ name + "\n" + "age:" + age + "\n" + "school:" + school + "\n"+ "major:" + major;
    }
}

