package com.yearup.models.enums;

public enum OtherTopping {
    STEAK(Type.MEAT),
    HAM(Type.MEAT),
    SALAMI(Type.MEAT),
    ROAST_BEEF(Type.MEAT),
    CHICKEN(Type.MEAT),
    BACON(Type.MEAT),

    // Cheeses
    AMERICAN_CHEESE(Type.CHEESE),
    SWISS_CHEESE(Type.CHEESE),
    PROVOLONE_CHEESE(Type.CHEESE),
    CHEDDAR_CHEESE(Type.CHEESE);

    private final Type type;

    OtherTopping(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MEAT,
        CHEESE
    }
}
