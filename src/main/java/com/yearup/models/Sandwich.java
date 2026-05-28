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


    public Sandwich(String name, SandwichSize size, BreadType breadType, boolean isToasted) {
        super(name, 0);
        this.size = size;
        this.breadType = breadType;
        this.includedTopping = new ArrayList<>();
        this.otherTopping = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.isToasted = isToasted;
        this.extraMeat = false;

        if (size == SandwichSize.FOUR_INCH) {
            this.price = 5.50;
        } else if (size == SandwichSize.EIGHT_INCH) {
            this.price = 7.00;
        } else if (size == SandwichSize.TWELVE_INCH) {
            this.price = 8.50;
        }

    }

    public Sandwich(String name, SandwichSize size, BreadType breadType,
                    boolean isToasted, List<IncludedTopping> includedTopping, List<OtherTopping> otherTopping, List<Sauce> sauce) {
        super(name, 0);
        this.size = size;
        this.breadType = breadType;
        this.includedTopping = includedTopping;
        this.otherTopping = otherTopping;
        this.isToasted = isToasted;
        this.sauces = sauce;
        this.extraMeat = false;

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

    public void addRegularTopping(IncludedTopping topping) {
        includedTopping.add(topping);
    }

    public void addPremiumTopping(OtherTopping topping) {
        otherTopping.add(topping);
    }

    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
    @Override
    public double calculateProductTotal() {
        double total = price;
        for (OtherTopping topping : otherTopping) {
            if (topping.getType() == OtherTopping.Type.MEAT) {
                if (size == SandwichSize.FOUR_INCH) {
                    total += 1.00;
                } else if (size == SandwichSize.EIGHT_INCH) {
                    total += 2.00;
                } else if (size == SandwichSize.TWELVE_INCH) {
                    total += 3.00;
                }
            }

            else if (topping.getType() == OtherTopping.Type.CHEESE) {
                if (size == SandwichSize.FOUR_INCH) {
                    total += 0.75;
                } else if (size == SandwichSize.EIGHT_INCH) {
                    total += 1.50;
                } else if (size == SandwichSize.TWELVE_INCH) {
                    total += 2.25;
                }
            }
        }

        if (extraMeat) {
            if (size == SandwichSize.FOUR_INCH) {
                total += 0.30;
            } else if (size == SandwichSize.EIGHT_INCH) {
                total += 0.60;
            } else if (size == SandwichSize.TWELVE_INCH) {
                total += 0.90;
            }
        }

        return total;
    }

    @Override
    public String productDetails() {
        StringBuilder details = new StringBuilder(name + "    " + String.format("$%.2f", calculateProductTotal()) + " \n"
                + size + "\n    Bread Type: " + breadType + "\n    Toasted: " + isToasted +  "\n    Regular Toppings: ");
        for (IncludedTopping topping : includedTopping) {
            details.append(topping).append(", ");
        }
        details.append("\n    Premium Toppings: ");
        for (OtherTopping topping : otherTopping) {
            details.append(topping).append(", ");
        }
        if(extraMeat) {
            details.append("\n    Extra Meat: Yes");
        } else {
            details.append("\n    Extra Meat: No");
        }
        details.append("\n    Sauces: ");
        for (Sauce sauce : sauces) {
            details.append(sauce).append(", ");
        }
        return details.toString();
    }
}
