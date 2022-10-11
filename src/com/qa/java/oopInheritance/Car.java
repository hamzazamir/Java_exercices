package com.qa.java.oopInheritance;

public class Car {

    int id;

    String name;

    int price;

    float engineSize;

    String fuelType;

    int manufacturingYear;

    public Car(int carId, String carName, int carPrice, float carEngineSize, String carFuelType, int carManufacturingYear) {
        this.id = carId;
        this.name = carName;
        this.price = carPrice;
        this.engineSize = carEngineSize;
        this.fuelType = carFuelType;
        this.manufacturingYear = carManufacturingYear;
    }

    void displayInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(engineSize);
        System.out.println(fuelType);
        System.out.println(manufacturingYear);
    }


}

