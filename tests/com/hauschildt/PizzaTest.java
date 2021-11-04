package com.hauschildt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void getName() {
        assertEquals(Pizza.DEFAULT_NAME, pizza.getName());
    }

    @Test
    void setName() {
        String name = "";
        pizza.setName(name);
        assertEquals(name, pizza.getName());
    }

    @Test
    void getPrice() {
        assertEquals(MenuItem.DEFAULT_PRICE, pizza.getPrice());
    }

    @Test
    void setPrice() {
        double newPizzaPrice = 1;
        pizza.setPrice(newPizzaPrice);
        assertEquals(newPizzaPrice, pizza.getPrice());
    }

    @Test
    void negativeBad() {
        System.out.println("Negative Prices are bad");
        double badPrice = -1.25;
        double normalPrice = pizza.getPrice();
        try {
            pizza.setPrice(badPrice);
            fail("Allowed to set invalid price");
        } catch (IllegalArgumentException i) {
            assertEquals(normalPrice, pizza.getPrice());
        }//Izy

    void setPriceNegativeBad() {
        double newPizzaPrice = -1;
        Exception exception = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                pizza.setPrice(newPizzaPrice);
            }
        });
        String expectedMessage = "The price of the pizza cannot be negative.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getDescription() {
        //Derrick
        assertEquals(Pizza.DEFAULT_DESCRIPTION, pizza.getDescription());
    }

    @Test
    void setDescription() {
        //Derrick
        pizza.setDescription("Unknown");
        assertEquals(Pizza.DEFAULT_DESCRIPTION, pizza.getDescription());
    }

    @Test
    void getSize() {
        assertEquals(Pizza.DEFAULT_SIZE, pizza.getSize());
    }

    @Test
    void setSize() {
        Size newSize = Pizza.MIN_DEFAULT_SIZE;
        pizza.setSize(newSize);
        assertEquals(newSize, pizza.getSize());
    }

    @Test
    void getCrust() {
        assertEquals(Pizza.DEFAULT_CRUST, pizza.getCrust());
    }

    @Test
    void setCrustWithGoodData() {
        pizza.setCrust(Crust.PAN);
        assertEquals(Crust.PAN, pizza.getCrust());
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
        assertEquals(Pizza.DEFAULT_MEAT, pizza.getMeat());
    }

    @Test
    void setMeat() {
        Meat[] meats = {Meat.PEPPERONI};
        pizza.setMeat(meats);
        assertEquals(meats, pizza.getMeat());
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
        String expected = "Pizza{" +
                "name='" + MenuItem.DEFAULT_NAME + '\'' +
                ", price=" + MenuItem.DEFAULT_PRICE +
                ", description='" + MenuItem.DEFAULT_DESCRIPTION + '\'' +
                ", size=" + Pizza.DEFAULT_SIZE +
                ", crust=" + Pizza.DEFAULT_CRUST +
                ", sauce=" + Pizza.DEFAULT_SAUCE +
                ", meat=" + Arrays.toString(Pizza.DEFAULT_MEAT) +
                ", veggies=" + Arrays.toString(Pizza.DEFAULT_VEGGIE) +
                '}';

        String actual = pizza.toString();

        assertEquals(expected, actual);
    }
}
