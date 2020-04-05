package com.company.creatures;

import com.company.Car;
import com.company.device.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    Phone phone;
    public Animal pet;
    public Human partner;
     private Car car;
    private Double salary = 1000.0;


    public Human() {
        super("Homo sapiens");
        this.weight = 100.0;
    }


    public Double getSalary() {
        return salary;
    }
    public Car getCar() {
        return car;
    }
    public void setSalary(Double salary) {
        System.out.println("Twoja pensja wynosi:" + salary);
        this.salary = salary;
    }

    public void setCar(Car car) {
        if(1000 > (getSalary() * 5)){
            System.out.println("You have no money, here!");
            this.car = car;
        }
        else{
            if(1000 > getSalary()){
                System.out.println("Leasing doesn't hurt, that much");
                this.car = car;
            }
            else{
                System.out.println("Give me some money, Scrooge McDuck!");
            }
        }
    }
    public void Share(Car car){
        this.car= car;
    }
    public String toString(){
        return firstName + " " + lastName;
    }
}
