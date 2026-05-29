package com.yearup.services.implement;

import com.yearup.controller.Menus;
import com.yearup.models.Drink;
import com.yearup.models.enums.DrinkSize;
import com.yearup.services.interfaces.DrinkService;

import java.util.Scanner;

public class DrinkServiceImplement implements DrinkService{
    private Scanner read;
    private DrinkSize drinkSize;

    public DrinkServiceImplement(Scanner read) {
        this.read = read;
    }

    @Override
    public Drink selectDrink() {
        System.out.println("\n\n\n" + Menus.getDrinks());
        String choice = read.nextLine();
        String drinkName;

        switch(choice) {
            case "1":
                drinkName = "Raspberry Ice Tea";
                break;
            case "2":
                drinkName = "Diet Coke";
                break;
            case "3":
                drinkName = "Coke";
                break;
            default:
                System.out.println("Invalid Choice. Try again");
                return null;
        }

        System.out.println("""
                Choose size
                1: Small
                2: Medium
                3: Large""");
        String sizeChoice = read.nextLine();
        switch(sizeChoice) {
            case "1":
                drinkSize = DrinkSize.SMALL;
                break;
            case "2":
                drinkSize = DrinkSize.MEDIUM;
                break;
            case "3":
                drinkSize = DrinkSize.LARGE;
                break;
            default:
                System.out.println("Invalid Choice. Try again");
                return null;
        }
        return new Drink(drinkName, drinkSize);
    }

}
