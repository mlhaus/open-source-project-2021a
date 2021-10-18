package com.hauschildt;

public enum Meat {
    PEPPERONI("Pepperoni")
    ,SAUSAGE("Italian sausage")
    ,CANADIAN_BACON("Canadian bacon")
    ,CHICKEN("Grilled chicken")
    ,BACON("Bacon")
    ,BEEF("Beef")
    ;

    String description;

    Meat(String description){
        this.description = description;
    }
}