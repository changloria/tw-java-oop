package com.afs.oopractice;

public class HelloWorld {
    public static void main(String[] args) {
        Car car = new Car("Car",30);
        car.speedUp();

        Truck truck = new Truck("Truck", 30);
        truck.speedUp();
    }
}
