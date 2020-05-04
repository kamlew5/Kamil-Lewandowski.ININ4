package com.company.creatures;

import com.company.Car;
import com.company.device.Phone;
import java.time.LocalDateTime;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    Phone phone;
    public Animal pet;
    public Human partner;
     private Car car;
    private Double salary;
    private LocalDateTime lastASalary;
    private Double lastSalary;


    public Human() {
        super("Homo sapiens");
        this.weight = 100.0;
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
    public void Share(Car car){
        this.car= car;
    }
    public String toString(){
        return firstName + " " + lastName;
    }
}
