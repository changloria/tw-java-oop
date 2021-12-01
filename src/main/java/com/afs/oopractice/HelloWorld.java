package com.afs.oopractice;


//AC3 driver, vehicles: name, speed
public class HelloWorld {
    public static void main(String[] args) {
        Car car = new Car("Car",30);
        car.speedUp();

        Truck truck = new Truck("Truck", 30);
        truck.speedUp();

        Driver carDriver = new Driver(new Car("Car", 30));
        Driver truckDriver = new Driver(new Truck("Truck", 10));
        carDriver.speedUp();
        truckDriver.speedUp();

        GasolineEngine gasolineEngine = new GasolineEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        Car gasolineCar = new Car("Gasoline Car", gasolineEngine);
        gasolineCar.speedUp();
        Car electricCar = new Car("Electric Car", electricEngine);
        electricCar.speedUp();
    }
}
