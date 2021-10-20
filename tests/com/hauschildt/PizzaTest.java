package com.hauschildt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void getName() {
        fail();
    }

    @Test
    void setName() {
        fail();
    }

    @Test
    void getPrice() {
        fail();
    }

    @Test
    void setPrice() {
        fail();
    }

    @Test
    void getDescription() {
        fail();
    }

    @Test
    void setDescription() {
        fail();
    }

    @Test
    void getSize() {
        fail();
    }

    @Test
    void setSize() {
        fail();
    }

    @Test
    void getCrust() {
        fail();
    }

    @Test
    void setCrust() {
        fail();
    }

    @Test
    void getSauce() {
        fail();
    }

    @Test
    void setSauce() {
        fail();
    }

    @Test
    void getMeat() {
        fail();
    }

    @Test
    void setMeat() {
        fail();
    }

    @Test
    void getVeggies() {
        Veggie[] expectedVeggies = Pizza.DEFAULT_VEGGIE;
        Veggie[] actualVeggies = pizza.getVeggies();
        Assertions.assertEquals(expectedVeggies, actualVeggies);
    }

    @Test
    void setVeggies10Good() {
        Veggie[] newVeggies = {Veggie.TOMATO, Veggie.PINEAPPLE, Veggie.MUSHROOM, Veggie.GREEN_PEPPER, Veggie.ONION,
                Veggie.BLACK_OLIVE, Veggie.JALAPENO, Veggie.CARROT, Veggie.BANANA_PEPPER, Veggie.SESAME_SEEDS};

        pizza.setVeggies(newVeggies);
        Veggie[] actualVeggies = pizza.getVeggies();

        Assertions.assertEquals(newVeggies, actualVeggies);
    }

    @Test
    void testToString() {
        fail();
    }
}