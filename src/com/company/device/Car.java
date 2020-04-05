package com.company.device;

public class Car extends device{
    public final String make;
    public final Integer displacement;
    public final String engine;

    public Car(String make, String model, Integer year, Integer displacement, String engine, Double price, String mark) {
        super(model, year, price, mark);
        this.make = make;
        this.displacement = displacement;
        this.engine = engine;
    }
    public String toString(){
        return make + " " + model + " "+ year;
    }


}
