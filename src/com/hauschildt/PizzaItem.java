package com.hauschildt;

public enum PizzaItem {
    PEPPERONI("Pepperoni Pizza", 13.49, "Your choice of crust covered " +
            "with our signature pizza sauce, real mozzarella cheese, and pepperoni. It's one " +
            "of our most popular pizzas.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI}, new Veggie[]{})
    ,SAUSAGE("Sausage Pizza", 13.49, "Our signature pizza sauce layered " +
            "with sausage and real mozzarella cheese. Your choice of crust.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.SAUSAGE}, new Veggie[]{})
    ,CHEESE("Cheese Pizza", 12.99, "Simple, yet delicious. Real mozarella " +
            "cheese on top of our signature pizza sauce with your choice of crust, then baked " +
            "to a golden brown.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{}, new Veggie[]{})
    ,THE_WORKS("The Works Pizza", 18.99, "A heaping helping of pepperoni, " +
            "Canadian bacon, spicy Italian sausage, fresh-cut onions, crisp green peppers, " +
            "mushrooms, ripe black olives, and real mozzarella cheese.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.PEPPERONI, Meat.CANADIAN_BACON,
            Meat.SAUSAGE}, new Veggie[]{Veggie.ONION, Veggie.GREEN_PEPPER, Veggie.MUSHROOM,
            Veggie.BLACK_OLIVE})
    ,THAI_VEGGIE("Thai Veggie Pizza", 15.00,
            "Thai peanut sauce, red onion, carrot, fresh red pepper, pineapple," +
                    "green pepper, and monterrey jack, topped with sesame seeds.", Size.LARGE, Crust.THIN,
            Sauce.THAI_PEANUT, new Meat[]{}, new Veggie[]{Veggie.RED_ONION, Veggie.CARROT, Veggie.RED_PEPPER,
            Veggie.PINEAPPLE, Veggie.GREEN_PEPPER, Veggie.SESAME_SEEDS})

    ;

    private Pizza item;

    PizzaItem(String name, double price, String description, Size size, Crust crust, Sauce sauce, Meat[] meat, Veggie[] veggies){
        item = new Pizza(name, price, description, size, crust, sauce, meat, veggies);
    }

    public Pizza getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
