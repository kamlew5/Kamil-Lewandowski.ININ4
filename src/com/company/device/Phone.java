package com.company.device;

import com.company.Saleable;
import com.company.creatures.Human;

public class Phone extends device implements Saleable {


    public Phone(String model, Integer year, Double price, String mark) {
        super(model, year, price, mark);
    }

    @Override
    void TurnOn() {
        System.out.println("Telefon robi bip bip");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Telefon został sprzedany nowemu właścicielowi.");
        } else {
            System.out.println("Za mało siana.");
        }
    }
}