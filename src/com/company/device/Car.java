package com.company.device;

import com.company.Saleable;
import com.company.creatures.Human;

public class Car extends device implements Saleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.recieveVehicle(seller.getCar());
            seller.unsetVehicle();
            System.out.println("Sprzedałeś auto.");
        } else {
            System.out.println("You have no money...");
        }
    }
}
