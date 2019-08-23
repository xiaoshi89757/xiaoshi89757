package com.company.day13;

import java.util.Objects;

public class Mydate implements Comparable{
    private Integer month;
    private Integer day;
    private Integer year;

    public Mydate() {
    }

    public Mydate(int month, int day, int year) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mydate)) return false;
        Mydate mydate = (Mydate) o;
        return Objects.equals(month, mydate.month) &&
                Objects.equals(day, mydate.day) &&
                Objects.equals(year, mydate.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mydate){
            Mydate m = (Mydate)o;
            int i = this.year.compareTo(m.getyear());
            if (i ==0){
                int j = this.month.compareTo(m.getMonth());
                if (j ==0){
                    return this.day.compareTo(m.getDay());
                }
            }
        }
        return 0;
    }
}
