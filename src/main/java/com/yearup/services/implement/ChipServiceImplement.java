package com.yearup.services.implement;

import com.yearup.controller.Menus;
import com.yearup.models.Chips;
import com.yearup.services.interfaces.ChipService;

import java.util.Scanner;


public class ChipServiceImplement implements ChipService {
    private final Scanner read;

    public ChipServiceImplement(Scanner read) {
        this.read = read;
    }

    public Chips selectChips() {
        System.out.println("\n\n\n" + Menus.getChips());
        String choice = read.nextLine();
        String chipsName;

        switch(choice) {
            case "1":
                chipsName = "Doritos Nacho Cheese";
                break;
            case "2":
                chipsName = "Cheetos";
                break;
            case "3":
                chipsName = "Lays";
                break;
            default:
                System.out.println("Invalid Choice. Try again");
                return null;
        }

        return new Chips(chipsName);
    }

}
