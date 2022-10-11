package com.qa.java.oopInheritance;

public class BMW extends Car{

    int noOfCylinders;

    int maxTorque;

    public BMW(int carId, String carName, int carPrice, float carEngineSize, String carFuelType, int carManufacturingYear, int noOfCylinders, int maxTorque) {
        super(carId, carName, carPrice, carEngineSize, carFuelType, carManufacturingYear);
        this.noOfCylinders = noOfCylinders;
        this.maxTorque = maxTorque;
    }
}
