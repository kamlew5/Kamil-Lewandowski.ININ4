package com.company;

public class Car{
    public final String make;
    public final String model;
    public final Integer year;
    public final Integer displacement;
    public final String engine;
    public final Double price;

    public Car(String make, String model, Integer year, Integer displacement, String engine, Double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.displacement = displacement;
        this.engine = engine;
        this.price = price;
    }

    public String toString() {
        return make + " " + model + " " + year;
    }

    public void TurnOn() {
    }


}
