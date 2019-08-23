package com.company.day8java2;

public class Women extends Person {
    private boolean isBeauty;

    public Women() {
    }

    public Women(boolean isBeauty) {
        this.isBeauty = isBeauty;
    }

    public boolean isBeauty() {
        return isBeauty;
    }

    public void setBeauty(boolean beauty) {
        isBeauty = beauty;
    }
    public void walk(){
        System.out.println("女人走路");
    }
    public void eat(){
        System.out.println("女人吃饭");
    }
}
