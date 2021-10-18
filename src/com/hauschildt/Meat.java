package com.hauschildt;

public enum Meat {
    PEPPERONI("Pepperoni")
    ,SAUSAGE("Italian sausage")
    ,CANADIAN_BACON("Canadian bacon")
    ,CHICKEN("Grilled chicken")
    ,BACON("Bacon")
    ,VEGAN_SAUSAGE("Plant Based Sausage")
    ;

    String description;

    Meat(String description){
        this.description = description;
    }
}