package com.company.device;

public class LPG extends Car{

    public LPG(String mark, String model, Integer year, Integer displacement, String engine, Double price) {
        super(mark, model, year, displacement, engine, price);
    }

    public void Refuel() {
        System.out.println("Zalany można dalej dymić");
    }
}