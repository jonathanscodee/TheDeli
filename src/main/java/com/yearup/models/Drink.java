package com.yearup.models;

import com.yearup.models.enums.DrinkSize;

public class Drink extends Product{
    private final DrinkSize size;

    public Drink(String name, DrinkSize size) {
        super(name, 0);
        this.size = size;
    }

    public DrinkSize getSize() {
        return size;
    }

    @Override
    public double calculateProductTotal() {
        if (size == DrinkSize.SMALL) {
            return 2.00;
        } else if (size == DrinkSize.MEDIUM) {
            return 2.50;
        } else if (size == DrinkSize.LARGE) {
            return 3.00;
        }
        return 0;
    }

    @Override
    public String productDetails() {
        return getSize() + " " + getName() + String.format(" $%.2f", calculateProductTotal());
    }
}
