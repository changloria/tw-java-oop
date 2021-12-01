package com.afs.oopractice;

public class Car {
    private final String name;
    private final int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(){
        System.out.println(name+": speed up "+speed+" km/h");
    }

}
