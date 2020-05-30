package com.company.device;

public class Phone extends device {


    public Phone(String model, Integer year, Double price, String mark) {
        super(model, year, price, mark);
    }

    @Override
    void TurnOn() {
        System.out.println("Telefon robi bip bip");
    }
}