package com.company;
//        https://docs.google.com/presentation/d/1vVJdl-YBjIzR2bcHMdjDY6U-iAdey4IhK34Hyrc86aQ/edit - link do prezentacji

import com.company.creatures.Animal;
import com.company.creatures.Human;
import java.time.format.DateTimeFormatter;
import com.company.device.device;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";
        DateTimeFormatter datethis = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        dog.feed();
        dog.feed();
        dog.feed();

        Human me = new Human();
        me.firstName = "Kamil";
        me.lastName = "Lewandowski";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        Human nikt = new Human();
        nikt.firstName ="Brak";
        nikt.lastName = "Znowu Brak";


        me.partner = nikt;
        nikt.partner = me;


        System.out.println(dog.name);
        System.out.println(me.pet.name);

        me.pet = dog;

        System.out.println("\n---- TASK 1 ----\n");

        /*me.pet.feed();
        me.pet.walk();
        me.pet.feed();
        me.pet.walk();
        me.pet.feed();
        me.pet.walk();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();*/
        while (me.pet.isAlive()) {
            me.pet.walk();
        }
        me.pet.walk();
        //me.pet.feed();

        me.setCar(new Car("Fiat", "124p(odnowiony)", 2018, 3902, "V8", 1500.0));
		System.out.println();
        System.out.println("my salary is:" + me.getSalary());
        System.out.println(me);
        System.out.println(me.species);
        System.out.println(me.pet);
        System.out.println(me.getCar());

        me.sell();
       // me.feed();


    }

}
