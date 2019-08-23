package com.company.day13;


import java.util.Objects;

public class Employee implements Comparable {

    private String name;
    private Integer age;
    private com.company.day13.Mydate birthday = new com.company.day13.Mydate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public com.company.day13.Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(com.company.day13.Mydate birthday) {
        this.birthday = birthday;
    }

    public Employee() {
    }

    public Employee(String name, Integer age, Mydate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee e = (Employee)o;
            return this.name.compareTo(e.name);
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}