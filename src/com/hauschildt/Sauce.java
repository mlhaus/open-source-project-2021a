package com.hauschildt;

public enum Sauce {
    NONE("No sauce")
    ,BBQ("BBQ sauce")
    ,MARINARA("Marinara sauce")
    ,RANCH("Ranch sauce")
    ,THOUSAND_ISLAND("Thousand Island dressing")
    ,THAI_PEANUT("Thai peanut sauce")
    ,BUFFALO("Buffalo hot sauce")
    ;

    String description;

    Sauce(String description){
        this.description = description;
    }
}

