package com.company.day9;

public class TestPerson {
    public static void main(String[] args) {
        /*
        * 关于String
        *
        * */
        String str1 = "AA";
        String str2 = "AA";
        String str3 = new String("AA");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }
}
class Person{
    String name;
    int id ;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class Student extends Person{
    String major;
    int id;

    public Student(){
        super.name = "AA";

    }
}
