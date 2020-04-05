package com.company.device;

import com.company.Saleable;

public class device implements Saleable {
    final public String model;
    final public Integer year;
    final public Double price;
    final public String mark;

    public device(String model, Integer year, Double price, String mark) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.mark = mark;
    }


    @Override
    public void sell() {
        System.out.println("This is for sale, bruh");
    }
}
