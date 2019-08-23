package com.company.day8java2;

public class Man extends Person {
    private boolean somking;

    public Man() {
    }

    public Man(boolean somking) {
        this.somking = somking;
    }

    public boolean isSomking() {
        return somking;
    }

    public void setSomking(boolean somking) {
        this.somking = somking;
    }
    public void walk(){
        System.out.println("男人走路");
    }
    public void eat(){
        System.out.println("男人吃饭");
    }
}
