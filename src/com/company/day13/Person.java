package com.company.day13;

public class Person  implements Comparable{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p =(Person)o;
            int i= this.name.compareTo(p.name);
            if (i ==0){
                return this.age.compareTo(p.age);
            }else {
                return i;
            }
        }
        return 0;
    }
}
