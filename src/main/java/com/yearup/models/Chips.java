package com.yearup.models;

public class Chips extends Product{

    public Chips(String name, double price) {
        super(name, 0);
    }


    @Override
    public double calculateProductTotal() {
        return 1.50;
    }

    @Override
    public String productDetails() {
        return getName() + " $" + String.format("%.2f", calculateProductTotal());
    }



}
