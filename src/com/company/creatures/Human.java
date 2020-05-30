package com.company.creatures;

import com.company.device.Phone;
import com.company.device.Car;
import java.time.LocalDateTime;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Human partner;
    private Car car;
    private Double salary = 300.0;
    private LocalDateTime lastASalary;
    private Double lastSalary;
    public Double cash = 3000.0;


    public Human() {
        super("Homo sapiens");
        this.weight = 100.0;
    }

    public Double getCash(){
        return this.cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }
    public void recieveVehicle(Car usedCar) {
        this.car = usedCar;
    }

    public void unsetVehicle() {
        this.car = null;
    }

    public Double getSalary() {
        System.out.println("Masz kasy: "+lastSalary+" pytali ostatnio o: "+lastASalary);
        this.lastSalary = this.salary;
        this.lastASalary = LocalDateTime.now();
        return this.salary;
    }
    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Księgowość wie, zapieprzaj do Hani z kadr po aneks. ZUS I US wie o twoich machlojkach.");
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be a negative value.");
        }
    }
    public void setCar(Car car) {
        if (getSalary() > car.price) {
            System.out.println("Give me some money, Scrooge McDuck!");
            this.car = car;
        } else {
            if (getSalary() > (car.price/12)) {
                System.out.println("Leasing doesn't hurt, that much");
                this.car = car;
            } else {
                System.out.println("You have no money, here!");
            }
        }
    }
    public Car getCar(){
        return this.car=car;
    }
    public void Share(Car car){
        this.car= car;
    }
    public String toString(){
        return firstName + " " + lastName;
    }

}
