package com.qa.java.oopInheritance;

public class Audi extends Car {

    String model;

    boolean isEVAvailable;

    public Audi(int carId, String carName, int carPrice, float carEngineSize, String carFuelType, int carManufacturingYear, String model, boolean isEVAvailable) {
        super(carId, carName, carPrice, carEngineSize, carFuelType, carManufacturingYear);
        this.model = model;
        this.isEVAvailable = isEVAvailable;
    }
}
