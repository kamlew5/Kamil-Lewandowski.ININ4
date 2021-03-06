package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable {
    public final String species;
    public Double weight;
    public String name;
    private Boolean alive;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 100.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
        this.alive = true;
    }

    public boolean isAlive() {
        if (this.weight > 0 && this.alive) {
            return true;
        } else {
            this.alive = false;
            return false;
        }
    }

    public void feed(Double foodWeight) {
        System.out.print("<feed> ");
        if (this.alive) {
            weight+=foodWeight;
            System.out.println("thx for food bro, my weight is now " + this.weight);
        } else System.out.println("Not gonna work...");
    }

    public void walk() {
        System.out.print("<walk> ");
        if (this.alive) {
            weight--;
            System.out.println("been walkin, my weight is now " + this.weight);
        } else System.out.println("Walking Dead is so last decade...");
    }

    //@Override
    //public void beEat() {
    //  if(this instanceof Human){
    //    System.out.println("Hell no!");}
    //else
    //{ System.out.println("Okey, go ahead");}
    //}

    @Override
    public String toString() {
        return "Animal:" +
                "species" + species + ' ' +
                ", weight" + weight;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("You lost your little friend, as*****");
        } else {
            System.out.println("You have no money...");
        }
    }
}
