package com.yearup.models;

import com.yearup.models.enums.*;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product{
    private SandwichSize size;
    private BreadType breadType;
    private List<IncludedTopping> includedTopping;
    private List<OtherTopping> otherTopping;
    private List<Sauce> sauces;
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;


    public Sandwich(String name, double price, SandwichSize size, BreadType breadType, List<IncludedTopping> includedTopping, List<OtherTopping> otherTopping, List<Sauce> sauces, boolean isToasted, boolean extraMeat, boolean extraCheese) {
        super(name, 0);
        this.size = size;
        this.breadType = breadType;
        this.includedTopping = new ArrayList<>();
        this.otherTopping = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.isToasted = isToasted;
        this.extraMeat = false;
        this.extraCheese = extraCheese;

        if (size == SandwichSize.FOUR_INCH) {
            this.price = 5.50;
        } else if (size == SandwichSize.EIGHT_INCH) {
            this.price = 7.00;
        } else if (size == SandwichSize.TWELVE_INCH) {
            this.price = 8.50;
        }

    }

    public SandwichSize getSize() {
        return size;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public List<IncludedTopping> getIncludedTopping() {
        return includedTopping;
    }

    public List<OtherTopping> getOtherTopping() {
        return otherTopping;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    @Override
    public double calculateProductTotal() {
        double total = price;
        for (OtherTopping topping : otherTopping) {
            if (topping.getType() == OtherTopping.Type.MEAT)
        }
    }
}
