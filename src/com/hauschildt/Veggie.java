package com.hauschildt;

public enum Veggie {
    TOMATO("Roma tomatoes")
    ,GREEN_PEPPER("Green peppers")
    ,MUSHROOM("Mushrooms")
    ,PINEAPPLE("Pineapple")
    ,BLACK_OLIVE("Black olives")
    ,ONION("Yellow onion")
    ,BANANA_PEPPER("Banana peppers")
    ,JALAPENO("Jalapeno")
    ,SAUERKRAUT("Sauerkraut")
    ,RED_ONION("Red onion")
    ,CARROT("Carrot")
    ,SESAME_SEEDS("Sesame seeds")
    ,RED_PEPPER("Red Pepper")
    ;

    String description;

    Veggie(String description){
        this.description = description;
    }
}

