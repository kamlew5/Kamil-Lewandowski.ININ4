package com.company.device;

public class Car extends device{
    public final Integer displacement;
    public final String engine;

    public Car(String mark, String model, Integer year, Integer displacement, String engine, Double price) {
        super (model, year, price, mark);
        this.displacement = displacement;
        this.engine = engine;
    }

    public void TurnOn() {
        System.out.println("Samochód robi brum brum");
    }
    public String toString(){
        return mark + " " + model + " "+ year;
    }


}
