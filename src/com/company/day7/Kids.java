package com.company.day7;

public class Kids extends ManKind {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.manOrWorman();
        someKid.employeed();
    }
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(this.yearsOld);
    }
}
