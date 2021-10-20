package com.hauschildt;

public enum Meat {
    PEPPERONI("Pepperoni")
    ,SAUSAGE("Italian sausage")
    ,CANADIAN_BACON("Canadian bacon")
    ,CHICKEN("Grilled chicken")
    ,BACON("Bacon")
    ,BEEF("Beef")
    ,ANCHOVY("Anchovy")
    ,VEGAN_SAUSAGE("Plant Based Sausage")
    ,CORNED_BEEF("Corned beef")
    ,HAM("Ham")
    ,ITALIAN_SAUSAGE("Italian Sausage")
    ;

    String description;

    Meat(String description){
        this.description = description;
    }
}