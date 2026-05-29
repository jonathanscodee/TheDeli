package com.yearup.controller;

public class Menus {
    static String homeMenu = """
╔════════════════════════════════════════════════════════════╗
║                    Welcome to the Deli Order System        ║
╠════════════════════════════════════════════════════════════╣
║                        1: New Order                        ║
║                        0: Exit                             ║
╚════════════════════════════════════════════════════════════╝
                \s
                  Choose an option:\s""";

    static String orderMenu = """
╔════════════════════════════════════════════════════╗
║                    Order Menu                      ║
╠════════════════════════════════════════════════════╣
║                 1: Add Sandwich                    ║
║                 2: Add Chips                       ║
║                 3: Add Drink                       ║
║                 4: Checkout                        ║
║                 0: Cancel Order                    ║
╚════════════════════════════════════════════════════╝
              Choose an option:\s""";

    static String chips = """
╔══════════════════════════════════════════════════════════╗
║                     Chips Selection                      ║
╠══════════════════════════════════════════════════════════╣
║                 1: Doritos Nacho Cheese                  ║
║                 2: Cheetos                               ║
║                 3: Lays                                  ║
╚══════════════════════════════════════════════════════════╝
                 Choose an option:\s""";

    static String includedToppings = """
╔══════════════════════════════════════════════════════════╗
║                   Included Toppings                      ║
╠══════════════════════════════════════════════════════════╣
║                 1: Lettuce                               ║
║                 2: Peppers                               ║
║                 3: Onions                                ║
║                 4: Tomatoes                              ║
║                 5: Jalapenos                             ║
║                 6: Cucumbers                             ║
║                 7: Pickles                               ║
║                 8: Guacamole                             ║
║                 9: Mushrooms                             ║
║                 0: Done                                  ║
╚══════════════════════════════════════════════════════════╝
                 Choose an option:\s""";

    static String otherToppings = """
╔══════════════════════════════════════════════════════════╗
║                   Other Toppings                         ║
╠══════════════════════════════════════════════════════════╣
║                 1: Steak                                 ║
║                 2: Ham                                   ║
║                 3: Salami                                ║
║                 4: Roast Beef                            ║
║                 5: Chicken                               ║
║                 6: Bacon                                 ║
║                 7: American Cheese                       ║
║                 8: Swiss Cheese                          ║
║                 9: Provolone Cheese                      ║
║                 10: Cheddar Cheese                       ║
║                 0: Done                                  ║
╚══════════════════════════════════════════════════════════╝
                 Choose an option:\s""";

    static String drinks = """
╔══════════════════════════════════════════════════════════╗
║                       Drinks                             ║
╠══════════════════════════════════════════════════════════╣
║                 1: Raspberry Ice Tea                     ║
║                 2: Diet Coke                             ║
║                 3: Coke                                  ║
╚══════════════════════════════════════════════════════════╝
                 Choose an option:\s""";

    static String sauces = """
╔══════════════════════════════════════════════════════════╗
║                       Sauces                             ║
╠══════════════════════════════════════════════════════════╣
║                 1: Mayo                                  ║
║                 2: Mustard                               ║
║                 3: Ketchup                               ║
║                 4: Ranch                                 ║
║                 5: Thousand Island                       ║
║                 6: Vinaigrette                           ║
║                 7: Au Jus                                ║
║                 0: Done                                  ║
╚══════════════════════════════════════════════════════════╝
                 Choose an option:\s""";

    public static String getHomeMenu() {
        return homeMenu;
    }

    public static String getOrderMenu() {
        return orderMenu;
    }

    public static String getOtherToppings() {
        return otherToppings;
    }

    public static String getIncludedToppings() {
        return includedToppings;
    }

    public static String getChips() {
        return chips;
    }

    public static String getDrinks() {
        return drinks;
    }

    public static String getSauces() {
        return sauces;
    }
}
