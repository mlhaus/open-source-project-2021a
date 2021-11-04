package com.hauschildt;

public abstract class MenuItem {
    private String name;
    private double price;
    private String description;

    public static final String DEFAULT_NAME = "Unknown";
    public static final double DEFAULT_PRICE = 0;
    public static final String DEFAULT_DESCRIPTION = "Unknown";

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    private void validatePrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("The price can't be negative.");
        }
    }
}
