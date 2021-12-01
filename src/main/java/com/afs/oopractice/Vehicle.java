package com.afs.oopractice;

public class Vehicle {
    private final String name;
    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(){
        System.out.println(name+" : speed up "+speed+" km/h");
    }
}
